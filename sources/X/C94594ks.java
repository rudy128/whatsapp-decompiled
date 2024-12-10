package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4ks  reason: invalid class name and case insensitive filesystem */
public class C94594ks implements C108875cR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C94594ks(C80133wd r2) {
        this.A00 = 1;
        this.A02 = r2;
        this.A01 = C17880vN.A13();
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void BLL() {
    }

    public Object BPO(Class cls) {
        if (this.A00 != 0) {
            return null;
        }
        C18070vi.A0d(cls, 0);
        return ((C108875cR) this.A02).BPO(cls);
    }

    public /* synthetic */ int BW6(AnonymousClass206 r3) {
        if (1 - this.A00 != 0) {
            return 1;
        }
        C18070vi.A0d(r3, 0);
        Number number = (Number) ((Map) this.A01).get(r3.A0v);
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }

    public /* synthetic */ boolean Bcq() {
        return false;
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public /* synthetic */ void CJr(AnonymousClass206 r3, int i) {
        if (1 - this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            AnonymousClass205 r0 = r3.A0v;
            C18070vi.A0W(r0);
            C17880vN.A1P(r0, (Map) this.A01, i);
        }
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        if (1 - this.A00 != 0) {
            return 0;
        }
        return 5;
    }

    public C108675c7 getConversationRowCustomizer() {
        switch (this.A00) {
            case 0:
                return (C108675c7) this.A01;
            case 1:
                C80133wd r0 = (C80133wd) this.A02;
                AnonymousClass4SX r1 = r0.A04;
                if (r1 != null) {
                    return r1.A00(C72453Mb.A0I(r0.A08));
                }
                C18070vi.A11("conversationRowCustomizers");
                throw null;
            default:
                return ((AnonymousClass4SX) this.A02).A08;
        }
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        Object obj;
        switch (this.A00) {
            case 0:
                AnonymousClass1F9 lifecycleOwner = ((C108875cR) this.A02).getLifecycleOwner();
                C18070vi.A0X(lifecycleOwner);
                return lifecycleOwner;
            case 1:
                obj = this.A02;
                break;
            default:
                obj = this.A01;
                break;
        }
        return (AnonymousClass1FB) obj;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BLe(AnonymousClass206 r1) {
    }

    public /* synthetic */ boolean Bfa(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CH6(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void COH(AnonymousClass206 r1) {
    }

    public /* synthetic */ boolean CPY(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ void CRK(AnonymousClass206 r1) {
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CKg(List list, boolean z) {
    }

    public void CND(View view, AnonymousClass206 r2, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public C94594ks(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
