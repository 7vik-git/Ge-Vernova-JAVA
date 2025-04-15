package com.gevernova.encapsulation.library;

public Book(int id, String title, String author) {
    super(id, title, author);
}

public int getLoanDuration() {
    return 21;
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