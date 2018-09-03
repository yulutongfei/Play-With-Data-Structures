package com.sunxu.setandmap;

/**
 * @author 孙许
 * @date 2018-09-03
 * @description
 */
public interface Set<E> {
    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
