package com.noirix;

import com.noirix.domain.Computer;
import com.noirix.exception.EntityNotFoundException;

import java.util.IllegalFormatException;

public class ExceptionTests {
    public static void main(String[] args) {

        try {
            Computer computer = new Computer();
            computer.parentBehaviour();
            try {
                try {
                    computer.someBehaviour();
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                System.out.println("We are inside Inner try");
            }
            computer.parentBehaviour();
            throw new EntityNotFoundException("Some custom error", 404);
        } catch (ArithmeticException | IllegalArgumentException e) {
            e.getMessage();
            System.out.println(e.getClass());
            System.out.println("We successfully caught ArithmeticException or IllegalFormatException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println("We successfully caught Throwable");
        } finally {
            System.out.println("Finally!");
        }

        //try - catch - finally
        //try - catch
        //try - finally

        System.out.println("The END!");

    }
}
