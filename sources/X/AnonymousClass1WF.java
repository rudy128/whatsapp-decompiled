package X;

import android.content.ContentValues;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1WF  reason: invalid class name */
public class AnonymousClass1WF {
    public static final int A0B = ((int) TimeUnit.DAYS.toSeconds(60));
    public final AnonymousClass11S A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1Cd A02;
    public final C202711m A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass121 A07;
    public final AnonymousClass1Q2 A08;
    public final AnonymousClass1PQ A09;
    public final AnonymousClass00H A0A;

    public LinkedHashMap A00(AnonymousClass1BI r6) {
        ArrayList A072 = this.A03.A07(((C56952iI) this.A05.get()).A00(), this.A01.A09(r6));
        StringBuilder sb = new StringBuilder();
        sb.append("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedAddOns size:");
        sb.append(A072.size());
        Log.i(sb.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap(A072.size());
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A002 = C63792th.A00((AnonymousClass212) it.next(), (AnonymousClass1W6) this.A0A.get());
            if (A002 != null) {
                AnonymousClass205 r1 = A002.A0v;
                if (!linkedHashMap.containsKey(r1)) {
                    linkedHashMap.put(r1, A002);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedParentMessages size:");
        sb2.append(linkedHashMap.size());
        Log.i(sb2.toString());
        return linkedHashMap;
    }

    public void A01(C41851xA r16, C28791au r17, long j) {
        C202711m r5 = this.A03;
        ArrayList A072 = r5.A07(-1, j);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageAddOnPinInChatManager/unpinOldPinsIfExceedLimit/pinnedAddOns size:");
        sb.append(A072.size());
        Log.i(sb.toString());
        for (int A002 = ((C56952iI) this.A05.get()).A00(); A002 < A072.size(); A002++) {
            AnonymousClass22C r3 = (AnonymousClass22C) A072.get(A002);
            r3.A00 = 0;
            r5.A09(r3, r3.A0x);
            this.A04.get();
            long j2 = r3.A0x;
            C23141Ev r9 = ((C28801av) r17).A02;
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_add_on_row_id", Long.valueOf(j2));
            contentValues.put("pin_in_chat_state", Integer.valueOf(r3.A00));
            contentValues.put("sender_timestamp", Long.valueOf(r3.A01));
            r9.A02(contentValues, "message_add_on_pin_in_chat", "message_add_on_row_id = ?", "MessageAddOnPinInChatStore/updateMessageAddOnPinInChat", new String[]{String.valueOf(j2)});
            AnonymousClass206 A003 = C63792th.A00(r3, (AnonymousClass1W6) this.A0A.get());
            if (A003 != null) {
                r3.A05 = new A51(A003.A0H(), A003.A0v);
                A02(r16, A003, r3);
                Message.obtain(this.A08.A02, 2, 34, 0, A003).sendToTarget();
            }
        }
    }

    public void A03(AnonymousClass22C r8) {
        AnonymousClass1BI A0I;
        AnonymousClass205 r0 = r8.A0v;
        AnonymousClass1BI r2 = r0.A00;
        if (r2 != null) {
            if (r0.A02) {
                AnonymousClass11S r02 = this.A00;
                r02.A0I();
                A0I = r02.A0E;
            } else {
                A0I = r8.A0I();
            }
            if (r8.A00 == 1) {
                AnonymousClass121 r5 = this.A07;
                AnonymousClass1PQ r03 = this.A09;
                C436420i r04 = new C436420i(r03.A02.A01(r2, true), 118, r8.A0I);
                r04.A0d(A0I);
                r5.BBM(r04);
            }
        }
    }

    public AnonymousClass1WF(AnonymousClass11S r1, AnonymousClass1LW r2, AnonymousClass121 r3, AnonymousClass1Q2 r4, AnonymousClass1Cd r5, C202711m r6, AnonymousClass1PQ r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A01 = r2;
        this.A00 = r1;
        this.A08 = r4;
        this.A0A = r8;
        this.A07 = r3;
        this.A03 = r6;
        this.A06 = r9;
        this.A02 = r5;
        this.A09 = r7;
        this.A05 = r10;
        this.A04 = r11;
    }

    public void A02(C41851xA r3, AnonymousClass206 r4, AnonymousClass22C r5) {
        C17960vV.A0F(r3.A01(), "CoreMessageStore methods must be called within a live DB transaction");
        C63892tr.A06(r4, r5);
        if (!r4.A10(8)) {
            r4.A0W(8);
            this.A07.CQv(r4);
        }
        ((AnonymousClass122) this.A07).A0R.A0B(r4);
    }
}
