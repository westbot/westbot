public class User {
    private String name = "Unknown";
    private String surname = "Unknown";
    private String email = "nowhere@nowhere";
    private String phone = "--";
    private String last_visited = "never";
    private int number_of_orders = 0;
    private double biggest_check = 0.;
    private double total_of_all_purchases = 0.;

    public String toString() {
        return String.format("%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s\n%-20s%d\n%-20s$%.2f\n%-20s$%.2f",
                "Name: ", name, "Surname: ", surname, "Email: ", email, "Phone: ", phone, "Last visited: ",last_visited,
                "Num. orders: ", number_of_orders, "Max. check: ", biggest_check, "Total of purchases: ", total_of_all_purchases);
    }

    public static class Builder {
        private User user;

        public Builder() {
            user = new User();
        }

        public Builder withName(String name) {
            user.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            user.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            user.email = email;
            return this;
        }

        public Builder withPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public Builder withLastVisited(String last_visited) {
            user.last_visited = last_visited;
            return this;
        }

        public Builder withNumberOfOrders(int number_of_orders) {
            user.number_of_orders = number_of_orders;
            return this;
        }

        public Builder withBiggestCheck(double biggest_check) {
            user.biggest_check = biggest_check;
            return this;
        }

        public Builder withTotalOfAllPurchases(double total_of_all_purchases) {
            user.total_of_all_purchases = total_of_all_purchases;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
