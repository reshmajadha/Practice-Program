package toturial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpListSorting {


    public EmpListSorting(int i, String ress, int i1) {
    }

    public static void main(String[] args) {
        //Sorting Emp

//        List<EmpListSorting> Emp=new ArrayList<EmpListSorting>();
//        Emp.add(new EmpListSorting(10,"ress",30000));
//        Emp.add(new EmpListSorting(21,"ewq",34000));
//        Emp.add(new EmpListSorting(1,"csd",5122));
//        Emp.add(new EmpListSorting(5,"hfd",183333));
//
//        Emp.stream().sorted(new Comparator<EmpListSorting>() {
//            @Override
//            public int compare(EmpListSorting o1, EmpListSorting o2) {
//                return (int) (o1.salary()-o2.salary());
//            }
//        }).collect(Collectors.toList());
//
//    }

    }

    public int salary() {
        return 0;
    }


    class Emp {
        private int id;
        private String name;
        private float salary;

        public Emp(int id, String name, float salary) {
            super();
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}