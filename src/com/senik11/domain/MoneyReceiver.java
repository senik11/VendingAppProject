package com.senik11.domain;

/*
* Класс, описывающий функционал приёмника денег
* */
public interface MoneyReceiver {
    int receiveMoney(int amount);
    int returnMoney(int amount);
}
