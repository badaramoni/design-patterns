public class Main {
    public static void main(String[] args) {

        Collectionimpl collectionimpl = new Collectionimpl();
        IteratorInterface iteratorInterface = collectionimpl.getIterator();

        while (iteratorInterface.hasNext()){
            Object object = iteratorInterface.next();
            String model = (String)object;
            System.out.println("model release version : " + model);
        }

    }
}
