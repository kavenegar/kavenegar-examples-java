/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kavenegar.examples.java;

import java.util.List;
import java.util.ArrayList;

import com.kavenegar.sdk.KavenegarApi;
import com.kavenegar.sdk.excepctions.*;
import com.kavenegar.sdk.models.*;


/**
 *
 * @author Kavenegar
 */
public class App {

    private static KavenegarApi api;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        api = new KavenegarApi("APIKEY here");
        Send();
        System.out.print("\r\n\r\n");
    }

    public static void Send() {
        try {
            String sender = "Line Number here";
            String receptor = "Rreceptor mobile number here";
            String message = "Message here";
            SendResult Result = api.send(sender, receptor, message);
            System.out.println("messageid : " + Result.getMessageId());
            System.out.println("message  : " + Result.getMessage());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());
            System.out.println("sender  : " + Result.getSender());
            System.out.println("receptor  : " + Result.getReceptor());
            System.out.println("date  : " + Result.getDate());
            System.out.println("cost  : " + Result.getCost());
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }



    public static void SendArray() {
        try {
            List<String> receptors = new ArrayList<>();
            receptors.add("");
            List<String> senders = new ArrayList<>();
            senders.add("");
            List<String> messages = new ArrayList<>();
            messages.add("");
            List < SendResult > Results = api.sendArray(senders, receptors, messages);
            for (SendResult Result: Results) {
                System.out.println("messageid : " + Result.getMessage());
                System.out.println("message  : " + Result.getMessage());
                System.out.println("status  : " + Result.getStatus());
                System.out.println("statustext  : " + Result.getStatusText());
                System.out.println("sender  : " + Result.getSender());
                System.out.println("receptor  : " + Result.getReceptor());
                System.out.println("date  : " + Result.getDate());
                System.out.println("cost  : " + Result.getCost());
            }
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }


    public static void Status() {
        try {
            long messageid = 56169156;
            StatusResult Result = api.status(messageid);
            System.out.println("messageid : " + Result.getMessageId());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }



    public static void StatusLocalMessageId() {
        try {
            long localid = 56169156;
            StatusLocalMessageIdResult Result = api.statusLocalMessageId(localid);
            System.out.println("messageid : " + Result.getMessageId());
            System.out.println("localid  : " + Result.getLocalId());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());

        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }



    public static void Select() {
        try {
            long massageIds = 56169156;
            SendResult Result = api.select(massageIds);
            System.out.println("messageid : " + Result.getMessage());
            System.out.println("message  : " + Result.getMessage());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());
            System.out.println("sender  : " + Result.getSender());
            System.out.println("receptor  : " + Result.getReceptor());
            System.out.println("date  : " + Result.getDate());
            System.out.println("cost  : " + Result.getCost());
        }catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }


    public static void SelectOutbox() {
        try {
            long startdate = 1432651200;
            long enddate = 1443278400;
            String sender = "";
            List < SendResult > Results = api.selectOutbox(startdate, enddate, sender);
            for (SendResult Result: Results) {
                System.out.println("message : " + Result.getMessage());
                System.out.println("messageid : " + Result.getMessageId());
                System.out.println("status : " + Result.getStatus());
                System.out.println("statustext : " + Result.getStatusText());
                System.out.println("sender : " + Result.getSender());
                System.out.println("receptor : " + Result.getReceptor());
                System.out.println("date : " + Result.getDate());
                System.out.println("cost : " + Result.getCost());
                System.out.println("\r\n");
            }
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }



    public static void LatestOutbox() {
        try {
            long pagesize = 100;
            String sender = "";
            List < SendResult > Results = api.latestOutbox(pagesize, sender);
            for (SendResult Result: Results) {
                System.out.println("message : " + Result.getMessage());
                System.out.println("messageid : " + Result.getMessageId());
                System.out.println("status : " + Result.getStatus());
                System.out.println("statustext : " + Result.getStatusText());
                System.out.println("sender : " + Result.getSender());
                System.out.println("receptor : " + Result.getReceptor());
                System.out.println("date : " + Result.getDate());
                System.out.println("cost : " + Result.getCost());
                System.out.println("\r\n");
            }
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }


    public static void CountOutbox() {
        try {
            long startdate = 1432651200;
            long enddate = 1443278400;
            int status = 10;
            CountOutboxResult Result = api.countOutbox(startdate, enddate, status);
            System.out.println("startdate : " + Result.getStartDate());
            System.out.println("enddate : " + Result.getEndDate());
            System.out.println("sumcount : " + Result.getSumCount());
            System.out.println("sumpart : " + Result.getSumPart());
            System.out.println("sumcost : " + Result.getCost());
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }


    public static void Cancel() {
        try {
            long messageid = 56169156;
            com.kavenegar.sdk.models.StatusResult Result;
            Result = api.cancel(messageid);
            System.out.println("messageid : " + Result.getMessageId());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());

        }catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }

    public static void Receive() {
        try {
            String linenumber = "";
            int isread = 1;
            List < ReceiveResult > Results = api.receive(linenumber, isread);
            for (ReceiveResult Result: Results) {
                System.out.println("messageid : " + Result.getMessage());
                System.out.println("message  : " + Result.getMessage());
                System.out.println("sender  : " + Result.getSender());
                System.out.println("receptor  : " + Result.getReceptor());
                System.out.println("date  : " + Result.getDate());
            }
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }


    public static void CountInbox() {
        try {
            long startdate = 1432651200;
            long enddate = 1443278400;
            String linenumber = "";
            int isread = 1;
            CountInboxResult Result = api.countInbox(startdate, enddate, linenumber, isread);
            System.out.println("startdate : " + Result.getStartDate());
            System.out.println("enddate : " + Result.getEndDate());
            System.out.println("sumcount : " + Result.getSumCount());

        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }
    }

    public static void CountPostalCode() {
        try {
            long postacode = 4415853;
            List < CountPostalCodeResult > Results = api.countPostalCode(postacode);
            for (CountPostalCodeResult Result: Results) {
                System.out.println("section : " + Result.getSection());
                System.out.println("value : " + Result.getValue());
            }
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }

    }

    public static void AccountInfo() {
        try {
            AccountInfoResult Result = api.accountInfo();
            System.out.println("remaincredit : " + Result.getRemainCredit());
            System.out.println("expiredate : " + Result.getExpireDate());
            System.out.println("type : " + Result.getType());
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }

    }

    public static void VerifyLookup() {
        try {

            String receptor = "";
            String token = "";
            String token2 = "";
            String token3 = "";
            String template = "";
            SendResult Result = api.verifyLookup(receptor, token, token2, token3, template);
            System.out.println("messageid : " + Result.getMessage());
            System.out.println("message  : " + Result.getMessage());
            System.out.println("status  : " + Result.getStatus());
            System.out.println("statustext  : " + Result.getStatusText());
            System.out.println("sender  : " + Result.getSender());
            System.out.println("receptor  : " + Result.getReceptor());
            System.out.println("date  : " + Result.getDate());
            System.out.println("cost  : " + Result.getCost());
        } catch (HttpException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("HttpException  : " + ex.getMessage());
        } catch (ApiException ex) { // در صورتی که خروجی وب سرویس 200 نباشد این خطارخ می دهد.
            System.out.print("ApiException : " + ex.getMessage());
        }

    }
}