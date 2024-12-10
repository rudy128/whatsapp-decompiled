package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.9xI  reason: invalid class name and case insensitive filesystem */
public final class C197809xI {
    public final AnonymousClass11C A00;
    public final AnonymousClass10I A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.9td] */
    public static final void A00(AnonymousClass9X9 r6, C197809xI r7) {
        String str;
        Network activeNetwork;
        WifiInfo wifiInfo;
        Long l;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        ConnectivityManager A0E = r7.A00.A0E();
        Integer num6 = null;
        if (Build.VERSION.SDK_INT < 30) {
            str = "WA_WIFI_TELEMETRY_SRV_V3: No WifiTelemetry data gathered for < SDK_30";
        } else if (A0E == null || (activeNetwork = A0E.getActiveNetwork()) == null || A0E.getNetworkCapabilities(activeNetwork) == null) {
            str = "WA_WIFI_TELEMETRY_SRV_V3: connMgr is not setup";
        } else {
            Integer A0f = AnonymousClass3MY.A0f();
            ? obj = new Object();
            obj.A06 = null;
            obj.A07 = "";
            obj.A08 = "";
            obj.A00 = A0f;
            obj.A05 = A0f;
            obj.A04 = A0f;
            obj.A02 = A0f;
            obj.A03 = A0f;
            obj.A01 = A0f;
            NetworkCapabilities networkCapabilities = A0E.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                Log.i("WA_WIFI_TELEMETRY_SRV_V3: Gathering Telemetry from connMgr");
                if (transportInfo instanceof WifiInfo) {
                    wifiInfo = (WifiInfo) transportInfo;
                    if (wifiInfo != null) {
                        int rssi = wifiInfo.getRssi();
                        if (Integer.valueOf(rssi) != null) {
                            l = C17880vN.A0n(rssi);
                        }
                    }
                    l = null;
                } else {
                    wifiInfo = null;
                    l = null;
                }
                obj.A06 = l;
                if (wifiInfo != null) {
                    num = Integer.valueOf(wifiInfo.getWifiStandard());
                } else {
                    num = null;
                }
                obj.A05 = num;
                if (wifiInfo != null) {
                    num2 = Integer.valueOf(wifiInfo.getFrequency());
                } else {
                    num2 = null;
                }
                obj.A00 = num2;
                obj.A07 = "MHz";
                obj.A08 = "Mbps";
                if (wifiInfo != null) {
                    num3 = Integer.valueOf(wifiInfo.getTxLinkSpeedMbps());
                } else {
                    num3 = null;
                }
                obj.A04 = num3;
                if (wifiInfo != null) {
                    num4 = Integer.valueOf(wifiInfo.getMaxSupportedTxLinkSpeedMbps());
                } else {
                    num4 = null;
                }
                obj.A02 = num4;
                if (wifiInfo != null) {
                    num5 = Integer.valueOf(wifiInfo.getRxLinkSpeedMbps());
                } else {
                    num5 = null;
                }
                obj.A03 = num5;
                if (wifiInfo != null) {
                    num6 = Integer.valueOf(wifiInfo.getMaxSupportedRxLinkSpeedMbps());
                }
                obj.A01 = num6;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("\n            {\n                \"rssi\": ");
                A10.append(obj.A06);
                A10.append(",\n                \"frequencyUnit\": \"");
                A10.append(obj.A07);
                A10.append("\",\n                \"speedUnit\": \"");
                A10.append(obj.A08);
                A10.append("\",\n                \"frequency\": ");
                A10.append(obj.A00);
                A10.append(",\n                \"wifiStandard\": ");
                A10.append(obj.A05);
                A10.append(",\n                \"txLinkSpeed\": ");
                A10.append(obj.A04);
                A10.append(",\n                \"maxSupportedTxLinkSpeed\": ");
                A10.append(obj.A02);
                A10.append(",\n                \"rxLinkSpeed\": ");
                A10.append(obj.A03);
                A10.append(",\n                \"maxSupportedRxLinkSpeed\": ");
                A10.append(obj.A01);
                AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n            }\n        ", A10));
                r6.A00.A0g = obj;
                Log.i("WA_WIFI_TELEMETRY_SRV_V2 Received Wi-Fi telemetry data: ");
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("WA_WIFI_TELEMETRY_SRV_V2 Rssi : ");
                C17900vP.A0b(obj.A06, A102);
                return;
            }
            return;
        }
        Log.e(str);
    }

    public C197809xI(AnonymousClass11C r1, AnonymousClass10I r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
