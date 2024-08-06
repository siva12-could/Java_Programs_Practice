class CityCount extends Thread {
    private String city;
    private int count;
    private List<User> userList;

    
    public CityCount(String city, ArrayList<User> userList) {
        this.city = city;
        this.userList = userList;
        this.count = 0;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


    public void run() {
        for (User user : userList) {
            if (user.getCity().equalsIgnoreCase(city)) {
                count++;
            }
        }
        System.out.println(city + "--" + count);
    }
}
