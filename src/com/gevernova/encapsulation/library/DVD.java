package com.gevernova.encapsulation.library;

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrower) {
        if (isAvailable) {
            setBorrower(borrower);
            isAvailable = false;
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}
