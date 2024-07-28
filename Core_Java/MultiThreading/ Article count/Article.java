class Article extends Thread {
    private String line;
    private int count;

    
    public Article() {
        this.line = "";
        this.count = 0;
    }

    
    public Article(String line) {
        this.line = line;
        this.count = 0;
    }

    
    public String getLine() {
        return line;
    }

    
    public void setLine(String line) {
        this.line = line;
    }

    
    public int getCount() {
        return count;
    }

    public void run() {
        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the")) {
                count++;
            }
        }
    }
}
