package com.example.disability;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;


    public class DataPackager {

        String name,position,team;

        /*
        SECTION 1.RECEIVE ALL DATA WE WANNA SEND
         */

        String dataRegistration[];

        public DataPackager(String dataR[]) {
            this.dataRegistration = dataR;
        }

        /*
       SECTION 2
       1.PACK THEM INTO A JSON OBJECT
       1. READ ALL THIS DATA AND ENCODE IT INTO A FROMAT THAT CAN BE SENT VIA NETWORK
        */
        public String packData()
        {
            JSONObject jo=new JSONObject();
            StringBuffer packedData=new StringBuffer();

            try
            {
                jo.put("NameUtente",dataRegistration[0]);
                jo.put("Nome",dataRegistration[1]);
                jo.put("Cognome",dataRegistration[2]);
                jo.put("Password",dataRegistration[3]);
                jo.put("Email",dataRegistration[4]);
                jo.put("Phone",dataRegistration[5]);

                Boolean firstValue=true;

                Iterator it=jo.keys();

                do {
                    String key=it.next().toString();
                    String value=jo.get(key).toString();

                    if(firstValue)
                    {
                        firstValue=false;
                    }else
                    {
                        packedData.append("&");
                    }

                    packedData.append(URLEncoder.encode(key,"UTF-8"));
                    packedData.append("=");
                    packedData.append(URLEncoder.encode(value,"UTF-8"));

                }while (it.hasNext());

                return packedData.toString();

            } catch (JSONException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            return null;
        }

    }