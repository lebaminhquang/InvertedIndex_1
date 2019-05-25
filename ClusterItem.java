public class ClusterItem implements Comparable<ClusterItem> {

    private int clusterId;
    private String url;
    private int nos;
    private String sh;
    private String query;
    private double similarityScore;
    private int low;
    private int high;

    public ClusterItem() {
    }

    public ClusterItem(String url, double similarityScore) {
        this.url = url;
        this.similarityScore = similarityScore;
    }

    public ClusterItem(String url, String query, double similarityScore) {
        this.url = url;
        this.query = query;
        this.similarityScore = similarityScore;
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public double getSimilarityScore() {
        return similarityScore;
    }

    public void setSimilarityScore(double similarityScore) {
        this.similarityScore = similarityScore;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public int compareTo(ClusterItem o) {
        if (this.getSimilarityScore() > o.getSimilarityScore()) {
            return 1;
        } else if (this.getSimilarityScore() == o.getSimilarityScore()) {
            return 0;
        } else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return "[ URL= " + url + ", similarityScore=" + similarityScore + "]";
    }

}
