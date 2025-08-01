Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mid1, mid2;
        boolean isEven = (n % 2 == 0);
        if (isEven) {
            mid1 = n / 2 - 1;
            mid2 = n / 2;
        } else 
            mid1 = mid2 = n / 2;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == mid1 || row == mid2 || col == mid1 || col == mid2) 
                    System.out.print("0");
                else 
                    System.out.print("1");
            }
            System.out.println();
        }    
