<?php

interface Animal
{
    function speak();
}

/**
 * @deprecated
 */
class Tiger implements Animal
{
    function speak()
    {
        echo "Roar!";
    }
}

class TigerStrong implements Animal
{
    function speak()
    {
        echo "Roar!";
    }
}

class Cat implements Animal
{
    function speak()
    {
        echo "Meow";
    }
}

class Dog implements Animal
{
    function speak()
    {
        echo "Gog gog";
    }
}
