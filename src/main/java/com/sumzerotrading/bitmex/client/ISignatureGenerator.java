/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.bitmex.client;

/**
 *
 * @author RobTerpilowski
 */
public interface ISignatureGenerator {
    
    public String generateSignature( String apiKey, String verb, String path, int expires, String data );

}
