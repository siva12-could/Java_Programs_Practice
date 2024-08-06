class UserBO extends ArrayList<User> {
    public void removeUser(int n1, int n2) {
        if (n1 >= 0 && n2 < this.size()) {
            this.subList(n1, n2 + 1).clear();
        }
    }

    public static UserBO getList() {
        UserBO userList = new UserBO();
        userList.add(new User("mohan Raja", "9874563210", "mohan", "mohan@abc.in"));
        userList.add(new User("arjun Ravi", "4324237", "arjun", "arjun@abc.in"));
        userList.add(new User("Arun kumar", "9845671230", "arun", "arun@abc.in"));
        userList.add(new User("prakash raj", "7548921445", "prakash", "raj@abc.in"));
        return userList;
    }
}
