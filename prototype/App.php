<?php

$store1 = new Store("Toko X", "Surabaya", "Indonesia", "Smartphone");

$store2 = $store1->clone();
$store2->setName("Toko Y");

$store3 = $store1->clone();
$store3->setName("Toko Z")->setCity("Jogja")->setCategory("Prabot");

$store4 = $store3->clone();
$store4->setName("Toko A")->setCategory("Skincare");
