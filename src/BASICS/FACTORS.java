void main(String[] args) {
    System.out.println("Enter integer for which you need number of factors");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count = 0;
    System.out.println("Factors of " + x + " are ");
    for (int i = 1; i <= x; i++) {
        if (x % i == 0) {
            System.out.println(i);
            count++;
        }
    }
    System.out.println("total number of factors are " + count);


}