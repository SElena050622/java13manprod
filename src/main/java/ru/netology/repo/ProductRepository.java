package ru.netology.repo;

import ru.netology.product.Product;

public class ProductRepository {
    protected Product[] products = new Product[0];

    public void add(Product product) { //запоминание вещи
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeById(int id) { //удаление вещи
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
            products = tmp;
        }
    }

    public Product[] findAll() { //все элементы репозитория
        return products;
    }
}
