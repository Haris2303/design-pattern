<?php

interface Arena
{
    function start();
}

class ArenaEasy implements Arena
{
    function start()
    {
        echo "Arena Easy";
    }
}

class ArenaMedium implements Arena
{
    function start()
    {
        echo "Arena Medium";
    }
}

class ArenaHard implements Arena
{
    function start()
    {
        echo "Arena Hard";
    }
}
