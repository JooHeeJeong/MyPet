package com.example.mypet

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class dbHelper {

    //    lateinit var myHelper: myDBHelper
    lateinit var sqlDB: SQLiteDatabase

    fun selectSql(sql: String, myHelper: myDBHelper) : Cursor{
        sqlDB = myHelper.readableDatabase
        var cursor: Cursor

        cursor = sqlDB.rawQuery(sql, null)
//        while (cursor.moveToNext()){
//            if (cursor.getString(1) == null){
//                Log.d("dd", "no")
//            } else {
//                sqlDB.close()
//                return cursor
//            }
//        }
        return cursor
    }

    fun insertSql(sql: String, myHelper: myDBHelper): String{
        sqlDB = myHelper.writableDatabase
        sqlDB.execSQL(sql)
        return "complete insert"
    }

    inner class myDBHelper(context: Context) : SQLiteOpenHelper(context, "test.db", null, 1){
        override fun onCreate(db: SQLiteDatabase?){
            db!!.execSQL("CREATE TABLE IF NOT EXISTS user(id Integer PRIMARY KEY AUTOINCREMENT, userId TEXT, email TEXT, password TEXT, name TEXT)")
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion : Int){
            onCreate(db)
        }
    }
}