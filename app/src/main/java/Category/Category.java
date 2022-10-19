package Category;

import java.util.List;

import Ronaldo.Ronaldo;

public class Category {

    private String nameCategory;
    private List<Ronaldo> cr7;

    public Category(String nameCategory, List<Ronaldo> cr7) {
        this.nameCategory = nameCategory;
        this.cr7 = cr7;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Ronaldo> getCr7() {
        return cr7;
    }

    public void setCr7(List<Ronaldo> cr7) {
        this.cr7 = cr7;
    }
}
