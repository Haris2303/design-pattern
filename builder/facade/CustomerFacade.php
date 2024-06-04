<?php

class CustomerFacade
{
    public function toJson(Customer $customer): string
    {
        $customerArray = [
            "id" => $customer->getId(),
            "name" => $customer->getName(),
            "email" => $customer->getEmail()
        ];

        $json = json_encode($customerArray, JSON_PRETTY_PRINT);

        return $json;
    }
}
