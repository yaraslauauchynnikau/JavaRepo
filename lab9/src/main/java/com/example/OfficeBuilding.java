package com.example;

class OfficeBuilding extends Building {
    private int companies;

    OfficeBuilding(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }

    public int getCompanies() {
        return companies;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }

    @Override
    public String getPurpose() {
        return "Офисное здание";
    }

    @Override
    public int calculateCapacity() {
        return companies * 10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   назначение: %s | компаний: %d | вместимость: %d чел.%n",
                getPurpose(), companies, calculateCapacity());
    }
}
