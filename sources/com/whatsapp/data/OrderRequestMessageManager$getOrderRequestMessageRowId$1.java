package com.whatsapp.data;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C54262dr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1", f = "OrderRequestMessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OrderRequestMessageManager$getOrderRequestMessageRowId$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $orderId;
    public int label;
    public final /* synthetic */ C54262dr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderRequestMessageManager$getOrderRequestMessageRowId$1(C54262dr r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$orderId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new OrderRequestMessageManager$getOrderRequestMessageRowId$1(this.this$0, this.$orderId, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0056
            X.C30691eM.A01(r6)
            X.2dr r0 = r5.this$0
            X.1QX r0 = r0.A00
            java.lang.String r1 = r5.$orderId
            X.C17960vV.A01()
            X.1Cd r0 = r0.A01
            X.1at r4 = r0.get()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x004c }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x004c }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version, catalog_type FROM message_order WHERE order_id=?"
            java.lang.String r0 = "GET_ORDER_MESSAGE_BY_ORDER_ID_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x004c }
            r4.close()
            r1 = 0
            if (r2 == 0) goto L_0x0046
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "message_row_id"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x003f }
            r2.close()
            return r0
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()
        L_0x004b:
            return r1
        L_0x004c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0051 }
            throw r1
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OrderRequestMessageManager$getOrderRequestMessageRowId$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
