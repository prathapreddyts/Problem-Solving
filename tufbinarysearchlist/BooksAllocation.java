package tufbinarysearchlist;

public class BooksAllocation {
    public static int findPages(int[] books, int students) {
        if (books.length < students) {
            return -1;
        }
        int start = 0;
        int end = 0;
        for (int book : books) {
            start = Math.max(start, book);
            end += book;
        }
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (bookAllocation(books, mid, students)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static boolean bookAllocation(int[] books, int maxPages, int students) {
        int pages = 0;
        int studentCount = 1;
       for(int i=0;i<books.length;i++){
           if(pages+books[i]<= maxPages){
               pages+=books[i];
           }else{
               studentCount++;
               if(studentCount>students){
                   return false;
               }
               pages=books[i];
           }
       }
        return true;
    }

}
