<?php

$customer = new Customer("1", "Otong", "otong@example.com");

$facade = new CustomerFacade();
$json = $facade->toJson($customer);
