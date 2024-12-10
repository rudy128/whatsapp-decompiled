package com.whatsapp.appwidget;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1R3;
import X.AnonymousClass1XL;
import X.C000200d;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C21416Ajj;
import X.C25161Nd;
import X.C28721an;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0C;
    public AnonymousClass1KB A00;
    public C28721an A01;
    public C25161Nd A02;
    public C18000vb A03;
    public AnonymousClass1CJ A04;
    public AnonymousClass1R3 A05;
    public C18030ve A06;
    public AnonymousClass1LU A07;
    public AnonymousClass00H A08;
    public C21416Ajj A09;
    public final Object A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r5 != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x0025
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "widgetprovider/onappwidgetoptionschanged "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "x"
            X.C17900vP.A0j(r0, r1, r5)
            if (r4 == 0) goto L_0x0025
            if (r5 != 0) goto L_0x002b
        L_0x0025:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x002b:
            X.00H r0 = r6.A08
            java.lang.Object r1 = r0.get()
            X.1XL r1 = (X.AnonymousClass1XL) r1
            X.0vb r2 = r6.A03
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (!this.A0B) {
                synchronized (this.A0A) {
                    if (!this.A0B) {
                        AnonymousClass10E r2 = AnonymousClass10E.A10(context).AJU;
                        this.A06 = (C18030ve) r2.A04.get();
                        this.A00 = (AnonymousClass1KB) r2.A4b.get();
                        this.A07 = (AnonymousClass1LU) r2.ABd.get();
                        this.A04 = (AnonymousClass1CJ) r2.A2H.get();
                        this.A01 = (C28721an) r2.AC2.get();
                        this.A08 = C000200d.A00(r2.A0J);
                        this.A03 = (C18000vb) r2.ABz.get();
                        this.A05 = (AnonymousClass1R3) r2.A5f.get();
                        this.A02 = (C25161Nd) r2.A2v.get();
                        this.A0B = true;
                    }
                }
            }
            super.onReceive(context, intent);
        } catch (BadParcelableException unused) {
        }
    }

    public WidgetProvider(int i) {
        this.A0B = false;
        this.A0A = C17880vN.A0p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        if (r4 <= 9) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews A00(android.content.Context r9, X.AnonymousClass1XL r10, X.C18000vb r11, int r12, int r13, int r14) {
        /*
            boolean r8 = r10.A04()
            r5 = 100
            if (r13 <= r5) goto L_0x00cc
            if (r14 <= r5) goto L_0x00cc
            java.lang.String r1 = r9.getPackageName()
            r0 = 2131627620(0x7f0e0e64, float:1.888251E38)
            android.widget.RemoteViews r3 = new android.widget.RemoteViews
            r3.<init>(r1, r0)
            java.util.ArrayList r0 = A0C
            r2 = 1
            if (r0 == 0) goto L_0x00c8
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x00b7
            r6 = 0
            java.lang.Object r0 = r0.get(r6)
            X.206 r0 = (X.AnonymousClass206) r0
            boolean r0 = r0.A0w()
            r5 = 2131755469(0x7f1001cd, float:1.9141818E38)
            if (r0 == 0) goto L_0x0034
            r5 = 2131755473(0x7f1001d1, float:1.9141826E38)
        L_0x0034:
            long r0 = (long) r7
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.C17880vN.A1T(r4, r7, r6)
            java.lang.String r4 = r11.A0K(r4, r5, r0)
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            r3.setViewVisibility(r0, r6)
        L_0x0044:
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            r3.setTextViewText(r0, r4)
            java.lang.Class<com.whatsapp.appwidget.WidgetService> r0 = com.whatsapp.appwidget.WidgetService.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9, r0)
            java.lang.String r0 = "appWidgetId"
            r1.putExtra(r0, r12)
            java.lang.String r0 = r1.toUri(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            r5 = 2131432116(0x7f0b12b4, float:1.848598E38)
            r3.setRemoteAdapter(r12, r5, r1)
            java.lang.String r1 = "android.intent.action.VIEW"
            r0 = 0
            android.content.Intent r4 = X.AnonymousClass1LU.A0C(r9, r0)
            r4.setAction(r1)
            java.lang.String r0 = "WidgetProvider"
            X.C60442o2.A01(r4, r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            X.C1408573i.A04(r4, r1)
            boolean r0 = X.C1408573i.A02
            if (r0 == 0) goto L_0x0081
            r1 = 167772160(0xa000000, float:6.162976E-33)
        L_0x0081:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r9, r2, r4, r1)
            r3.setPendingIntentTemplate(r5, r0)
            if (r8 == 0) goto L_0x00b2
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r9)
        L_0x008e:
            r1 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            android.app.PendingIntent r0 = X.C17880vN.A07(r9, r0, r2)
            r3.setOnClickPendingIntent(r1, r0)
            r2 = 2131430398(0x7f0b0bfe, float:1.8482496E38)
            r3.setEmptyView(r5, r2)
            boolean r1 = r10.A07()
            r0 = 2131899270(0x7f123386, float:1.9433481E38)
            if (r1 != 0) goto L_0x00aa
            r0 = 2131898575(0x7f1230cf, float:1.9432072E38)
        L_0x00aa:
            java.lang.String r0 = r9.getString(r0)
            r3.setTextViewText(r2, r0)
            return r3
        L_0x00b2:
            android.content.Intent r0 = X.AnonymousClass1LU.A02(r9)
            goto L_0x008e
        L_0x00b7:
            r0 = 2131899270(0x7f123386, float:1.9433481E38)
            java.lang.String r4 = r9.getString(r0)
            r1 = 2131435885(0x7f0b216d, float:1.8493625E38)
            r0 = 8
            r3.setViewVisibility(r1, r0)
            goto L_0x0044
        L_0x00c8:
            java.lang.String r4 = ""
            goto L_0x0044
        L_0x00cc:
            java.lang.String r1 = r9.getPackageName()
            r0 = 2131627622(0x7f0e0e66, float:1.8882514E38)
            android.widget.RemoteViews r3 = new android.widget.RemoteViews
            r3.<init>(r1, r0)
            java.util.ArrayList r0 = A0C
            if (r0 == 0) goto L_0x00fb
            int r4 = r0.size()
            r1 = 2131429679(0x7f0b092f, float:1.8481038E38)
            r2 = 2131429679(0x7f0b092f, float:1.8481038E38)
            java.lang.String r0 = java.lang.Integer.toString(r4)
            r3.setTextViewText(r1, r0)
            if (r13 >= r5) goto L_0x0118
            r0 = 99
            if (r4 <= r0) goto L_0x0112
            r1 = 1096810496(0x41600000, float:14.0)
        L_0x00f5:
            java.lang.String r0 = "setTextSize"
            r3.setFloat(r2, r0, r1)
        L_0x00fb:
            if (r8 == 0) goto L_0x010d
            android.content.Intent r2 = X.AnonymousClass1LU.A0A(r9)
        L_0x0101:
            r1 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            r0 = 1
            android.app.PendingIntent r0 = X.C17880vN.A07(r9, r2, r0)
            r3.setOnClickPendingIntent(r1, r0)
            return r3
        L_0x010d:
            android.content.Intent r2 = X.AnonymousClass1LU.A02(r9)
            goto L_0x0101
        L_0x0112:
            r0 = 9
            r1 = 1101004800(0x41a00000, float:20.0)
            if (r4 > r0) goto L_0x00f5
        L_0x0118:
            r1 = 1106247680(0x41f00000, float:30.0)
            goto L_0x00f5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.A00(android.content.Context, X.1XL, X.0vb, int, int, int):android.widget.RemoteViews");
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("widgetprovider/update ");
        int[] iArr2 = iArr;
        C17900vP.A0o(A10, iArr2.length);
        C21416Ajj ajj = this.A09;
        if (ajj != null) {
            ajj.A08.set(true);
            this.A01.A00().removeCallbacks(this.A09);
        }
        C18030ve r10 = this.A06;
        AnonymousClass1KB r4 = this.A00;
        AnonymousClass1LU r11 = this.A07;
        AnonymousClass1CJ r8 = this.A04;
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        this.A09 = new C21416Ajj(appWidgetManager2, context2, r4, (AnonymousClass1XL) this.A08.get(), this.A02, this.A03, r8, this.A05, r10, r11, iArr2);
        this.A01.A00().post(this.A09);
        super.onUpdate(context, appWidgetManager, iArr2);
    }

    public WidgetProvider() {
        this(0);
    }
}
