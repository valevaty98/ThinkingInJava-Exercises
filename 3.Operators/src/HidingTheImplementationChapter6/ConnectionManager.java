package HidingTheImplementationChapter6;

public class ConnectionManager {
    private static Connection[] conn = new Connection[5];
    static int ind = 0;

    public static Connection getConn() {
        if(ind < 5) {
            return conn[ind++];
        }
        else return null;
    }

    private class Connection {
    }
}
