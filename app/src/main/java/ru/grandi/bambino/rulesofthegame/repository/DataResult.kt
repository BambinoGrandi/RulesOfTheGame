package ru.grandi.bambino.rulesofthegame.repository

sealed class DataResult {
    class Success<T>(val data: T) : DataResult()
    class Error(val error: Throwable) : DataResult()
}
