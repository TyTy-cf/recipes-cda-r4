package fr.cda.recipes.service.interfaces;

public interface BasicServiceInterface<T, L, C> {

    T create(C o);

    Boolean delete(L id);

}
