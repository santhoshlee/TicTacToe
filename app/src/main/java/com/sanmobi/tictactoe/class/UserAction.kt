package com.sanmobi.tictactoe.`class`

sealed class UserAction {

    object PlayAgainButtonClicked: UserAction()
    data class BoardTapped(val cellNo: Int): UserAction()

}
