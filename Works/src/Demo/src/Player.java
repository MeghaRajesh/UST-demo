import java.util.*;

class Player {
    // Attributes
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Parameterized Constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Array to store Player objects
        Player[] players = new Player[numPlayers];

        // Read details for each player
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            
            System.out.print("Player ID: ");
            int playerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Player Name: ");
            String playerName = scanner.nextLine();

            System.out.print("Runs: ");
            int runs = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Player Type: ");
            String playerType = scanner.nextLine();

            System.out.print("Match Type: ");
            String matchType = scanner.nextLine();

            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        // Test findPlayerWithLowestRuns
        System.out.print("Enter the player type to find the lowest runs: ");
        String playerTypeToFind = scanner.nextLine();
        int lowestRuns = findPlayerWithLowestRuns(players, playerTypeToFind);
        System.out.println("Lowest Runs for " + playerTypeToFind + ": " + (lowestRuns != 0 ? lowestRuns : "No players found"));

        // Test findPlayerByMatchType
        System.out.print("Enter the match type to find players: ");
        String matchTypeToFind = scanner.nextLine();
        Player[] sortedPlayers = findPlayerByMatchType(players, matchTypeToFind);
        System.out.println("Players with Match Type '" + matchTypeToFind + "' in descending order of playerId:");
        if (sortedPlayers != null) {
            for (Player player : sortedPlayers) {
                System.out.println("PlayerId: " + player.getPlayerId() + ", Name: " + player.getPlayerName());
            }
        } else {
            System.out.println("No players found for the specified match type.");
        }

        scanner.close();
    }

    // Method to find player with the lowest runs for a given player type
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (Player player : players) {
            if (player.getPlayerType().equalsIgnoreCase(playerType)) {
                found = true;
                if (player.getRuns() < minRuns) {
                    minRuns = player.getRuns();
                }
            }
        }

        return found ? minRuns : 0;
    }

    // Method to find players by match type in descending order of playerId
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        Player[] filteredPlayers = java.util.Arrays.stream(players)
                .filter(player -> player.getMatchType().equalsIgnoreCase(matchType))
                .toArray(Player[]::new);

        if (filteredPlayers.length == 0) {
            return null;
        }

        java.util.Arrays.sort(filteredPlayers, (p1, p2) -> Integer.compare(p2.getPlayerId(), p1.getPlayerId()));
        return filteredPlayers;
    }
}
