package com.exercises.AlgorithmicChallenges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class CanonicalPath {
	
	public String getCanonicalPath(final String absolutUnixPath) {
		final String[] directories = absolutUnixPath.split("/");

		final Deque<String> dirDeque = new ArrayDeque<>();
		for (final String dir : directories) {
			if (!"".equals(dir) && !".".equals(dir) && !"..".equals(dir)) {
				dirDeque.offerLast(dir);
			}

			if ("..".equals(dir)) {
				System.out.println("Removed: " + dirDeque.pollLast());
			}
		}

		return dirDeque.stream().collect(Collectors.joining("/", "/", ""));
	}

}
