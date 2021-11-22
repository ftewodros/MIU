package Lab1.Q1;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

        private List<Book> kidsBooks = new ArrayList<>();
        private List<Book> engineeringBooks = new ArrayList<>();
        private List<Book> storyBooks = new ArrayList<>();
        static int numBooksSold = 500;

        public BookStore() {
            Book bk = new Book();
            kidsBooks.add(bk);
            engineeringBooks.add(bk);
            storyBooks.add(bk);

        }

        public List<Book> getKidsBooks() {
            return kidsBooks;
        }

        public void setKidsBooks(List<Book> kidsBooks) {
            this.kidsBooks = kidsBooks;
        }

        public List<Book> getEngineeringBooks() {
            return engineeringBooks;
        }

        public void setEngineeringBooks(List<Book> engineeringBooks) {
            this.engineeringBooks = engineeringBooks;
        }

        public List<Book> getStoryBooks() {
            return storyBooks;
        }

        public void setStoryBooks(List<Book> storyBooks) {
            this.storyBooks = storyBooks;
        }
        public int trackSalesStatus(){
            int soldKids = 0;
            for (int i = 0; i< kidsBooks.size(); i++){
                soldKids += kidsBooks.get(i).getQuantity();
            }
            int soldEngineering = 0;
            for (int j = 0; j< engineeringBooks.size(); j++){
                soldEngineering += engineeringBooks.get(j).getQuantity();
            }
            int soldStory = 0;
            for (int k = 0; k< storyBooks.size(); k++){
                soldStory += storyBooks.get(k).getQuantity();
            }
            numBooksSold += soldKids + soldEngineering + soldStory;
            return  numBooksSold;
        }
        public int bookQuantity() {
            int bookKids = 0;
            for (int i = 0; i< kidsBooks.size(); i++){
                bookKids += kidsBooks.get(i).getQuantity();
            }
            int bookEngineering = 0;
            for (int j = 0; j< engineeringBooks.size(); j++){
                bookEngineering += engineeringBooks.get(j).getQuantity();
            }
            int bookStory = 0;
            for (int k = 0; k< storyBooks.size(); k++){
                bookStory += storyBooks.get(k).getQuantity();
            }
            int totalBooks = bookKids + bookEngineering + bookStory;
            return  totalBooks;
        }

        @Override
        public String toString() {
            return "BookStore{" +
                    "kidsBooks=" + kidsBooks +
                    ", engineeringBooks=" + engineeringBooks +
                    ", storyBooks=" + storyBooks +
                    '}';
        }
    }


