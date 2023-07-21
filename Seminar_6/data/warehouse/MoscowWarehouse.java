package Seminar_6.data.warehouse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import Seminar_6.data.Product;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoscowWarehouse extends Warehouse {
    public MoscowWarehouse(List<Product> products) {
        super(products);
    }

    public MoscowWarehouse() {
        ObjectMapper mapper = new ObjectMapper();
        List<Product> products = new ArrayList<>();
        try {
            products = Arrays.asList(mapper.readValue(new File("C:\\Users\\evgga\\Documents\\practicecode" +
                    "IdeaProjects\\O-O_Prog\\src\\main\\resources\\warehouse.json"), Product[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.setProducts(products);
    }

    @Override
    public void export() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.getProducts());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } try {
            Files.write(Paths.get("C:\\evgga\\Documents\\practicecode" +
                            "\\IdeaProjects\\O-O_Prog\\src\\main\\resources\\warehouse.json"),
                    jsonString.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> addProduct(Product product) {
        List<Product> temp = new ArrayList<>(super.getProducts());
        temp.add(product);
        return super.setProducts(temp);
    }

    @Override
    public List<Product> delete(Product product) {
        List<Product> temp = new ArrayList<>(super.getProducts());
        temp.remove(product);
        return super.setProducts(temp);
    }

    @Override
    public Product increase(Product product, int amount) {
        product.increaseQuantity(amount);
        return product;
    }

    @Override
    public Product decrease(Product product, int amount) {
        product.decreaseQuantity(amount);
        return product;
    }
}
