package com.whatsapp.messaging;

import X.AnonymousClass00H;
import X.AnonymousClass1DS;
import X.AnonymousClass1F9;
import X.AnonymousClass1GP;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass215;
import X.AnonymousClass4PP;
import X.AnonymousClass4SX;
import X.AnonymousClass4aU;
import X.C108675c7;
import X.C108875cR;
import X.C17880vN;
import X.C18070vi;
import X.C34441kU;
import X.C441822l;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseViewOnceMessageViewerFragment extends Hilt_BaseViewOnceMessageViewerFragment implements C108875cR {
    public AnonymousClass4SX A00;
    public C34441kU A01;
    public AnonymousClass206 A02;
    public AnonymousClass00H A03;

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void BLL() {
    }

    public /* synthetic */ void BLe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CH6(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CJr(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void CKg(List list, boolean z) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public void CND(View view, AnonymousClass206 r2, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void COH(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CRK(AnonymousClass206 r1) {
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
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

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public C108675c7 getConversationRowCustomizer() {
        AnonymousClass4SX r0 = this.A00;
        if (r0 != null) {
            return r0.A08;
        }
        C18070vi.A11("conversationRowCustomizers");
        throw null;
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
        return this;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        AnonymousClass205 A032 = AnonymousClass4aU.A03(A15(), "");
        A032.getClass();
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass206 A012 = AnonymousClass1W2.A01(A032, r0);
            if (A012 != null) {
                this.A02 = A012;
                if (A012 instanceof AnonymousClass215) {
                    AnonymousClass4PP r5 = ViewOnceNuxBottomSheet.A0B;
                    C34441kU r02 = this.A01;
                    if (r02 != null) {
                        AnonymousClass1GP A1F = A1F();
                        if (!r02.A00.A01((Object) null, "ephemeral_view_once_receiver") && A1F.A0Q("view_once_nux_v2") == null) {
                            r5.A00(A1F, A012, false);
                            return;
                        }
                        return;
                    }
                    str = "nuxManagerBridge";
                } else {
                    return;
                }
            } else {
                throw C17880vN.A0g();
            }
        } else {
            str = "fMessageDatabase";
        }
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ Object BPO(Class cls) {
        return null;
    }

    public /* synthetic */ int BW6(AnonymousClass206 r2) {
        return 1;
    }

    public /* synthetic */ boolean Bfa(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean CPY(AnonymousClass206 r2) {
        return false;
    }
}
