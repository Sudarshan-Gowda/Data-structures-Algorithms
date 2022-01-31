package com.star.sud.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

	static Integer HOME_TEAM_WON = 1;
	static Integer WINNING_POINTS = 3;

	public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

		String currentBestTeam = "";
		Map<String, Integer> scores = new HashMap<>();
		scores.put(currentBestTeam, 0);

		for (int i = 0; i < competitions.size(); i++) {

			ArrayList<String> arrayList = competitions.get(i);
			String homeTeam = arrayList.get(0);
			String awayTeam = arrayList.get(1);

			Integer result = results.get(i);
			String winningTeam = result == HOME_TEAM_WON ? homeTeam : awayTeam;

			updateScores(winningTeam, WINNING_POINTS, scores);

			if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
				currentBestTeam = winningTeam;
			}

		}
		return currentBestTeam;
	}

	private static void updateScores(String team, Integer points, Map<String, Integer> scores) {

		if (!scores.containsKey(team)) {
			scores.put(team, 0);
		}
		scores.put(team, scores.get(team) + points);
	}

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
		ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
		ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
		ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
		competitions.add(competition1);
		competitions.add(competition2);
		competitions.add(competition3);
		ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

		String tournamentWinner = tournamentWinner(competitions, results);
		System.out.println(tournamentWinner);
	}

}
