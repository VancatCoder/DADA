package com.scujcc.dada.helper

import org.litepal.crud.DataSupport

/**
 * Created by  范朝波 on 2018/2/27.
 * 微信    ：family997722
 * QQ号    ：1136836811
 */
class Stroke(var id: String, val date: String, val topic: String, val location: String, val image: String, val ordernumber: String, val name: String, val state: String, val paydate: String, val paynumber: String) : DataSupport()
