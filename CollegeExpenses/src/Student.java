public class Student {

        private String name;
        private String year;
        private double supplycost;
        private int creditHours;
        private double CostofCreditHours;
        private double CostsTotal;


        public Student(String name, String year, double supplycost, int creditHours, double CostsofCreditHours, double CostsTotal) {
            this.name = name;
            this.year = year;
            this.supplycost = supplycost;
            this.creditHours = creditHours;
            this.CostofCreditHours = CostsofCreditHours;
            this.CostsTotal = CostsTotal;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public double getCostOfSupplies() {
            return supplycost;
        }

        public void setCostOfSupplies(double costOfSupplies) {
            this.supplycost = costOfSupplies;
        }

        public int getCreditHours() {
            return creditHours;
        }

        public void setCreditHours(int creditHours) {
            this.creditHours = creditHours;
        }

        public double getCreditHoursCost() {
            return CostofCreditHours;
        }

        public void setCreditHoursCost(double creditHoursCost) {
            this.CostofCreditHours = creditHoursCost;
        }

        public double getTotalCosts() {
            return CostsTotal;
        }

        public void setTotalCosts(double totalCosts) {
            this.CostsTotal = totalCosts;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", year='" + year + '\'' +
                    ", costOfSupplies=" + supplycost +
                    ", creditHours=" + creditHours +
                    ", creditHoursCost=" + CostofCreditHours +
                    ", totalCosts=" + CostsTotal +
                    "}";
        }
    }


