package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import java.util.List;

/* renamed from: X.5hp  reason: invalid class name and case insensitive filesystem */
public final class C111025hp extends AnonymousClass292 {
    public int A00;
    public SparseArray A01 = new SparseArray();
    public C127246e2 A02;
    public AnonymousClass778 A03;
    public List A04 = C18460wS.A00;
    public boolean A05;
    public final AnonymousClass1GP A06;
    public final String A07;
    public final boolean A08;

    public C111025hp(AnonymousClass1GP r2, String str, int i, boolean z, boolean z2) {
        super(r2, 0);
        this.A07 = str;
        this.A06 = r2;
        this.A08 = z;
        this.A00 = i;
        this.A05 = z2;
    }

    public int A0A(Object obj) {
        return -2;
    }

    public void A0D(ViewGroup viewGroup) {
        C18070vi.A0d(viewGroup, 0);
        if (!this.A06.A0z()) {
            super.A0D(viewGroup);
        }
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        Object A0F = super.A0F(viewGroup, i);
        C18070vi.A0z(A0F, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        this.A01.put(i, A0F);
        return A0F;
    }

    public int A0E() {
        return this.A04.size();
    }

    public Fragment A0I(int i) {
        Fragment stickerExpressionsFragment;
        Bundle A0D;
        Object obj = this.A04.get(i);
        boolean z = true;
        if (C18070vi.A18(obj, C117235zR.A00)) {
            stickerExpressionsFragment = new EmojiExpressionsFragment();
            if (this.A00 != 7) {
                z = false;
            }
            A0D = C17880vN.A0D();
            A0D.putBoolean("isExpressionsSearch", this.A08);
            A0D.putBoolean("isCollapsed", this.A05);
            A0D.putBoolean("isMediaComposer", z);
        } else {
            C117245zS r1 = C117245zS.A00;
            if (C18070vi.A18(obj, r1)) {
                boolean A18 = C18070vi.A18(this.A02, r1);
                stickerExpressionsFragment = new GifExpressionsFragment();
                A0D = C17880vN.A0D();
                A0D.putBoolean("isExpressionsSearch", this.A08);
                A0D.putBoolean("isCollapsed", this.A05);
                A0D.putBoolean("isSelected", A18);
                if (this.A00 != 0) {
                    z = false;
                }
                A0D.putBoolean("isConversationOrigin", z);
            } else {
                C117225zQ r12 = C117225zQ.A00;
                if (C18070vi.A18(obj, r12)) {
                    boolean A182 = C18070vi.A18(this.A02, r12);
                    if (this.A00 != 7) {
                        z = false;
                    }
                    stickerExpressionsFragment = new AvatarExpressionsFragment();
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putString("rawChatJid", this.A07);
                    A0D2.putBoolean("isExpressionsSearch", this.A08);
                    A0D2.putBoolean("isCollapsed", this.A05);
                    A0D2.putBoolean("isSelected", A182);
                    A0D2.putBoolean("isMediaComposer", z);
                    stickerExpressionsFragment.A1R(A0D2);
                } else if (C18070vi.A18(obj, C117255zT.A00)) {
                    String str = this.A07;
                    boolean z2 = this.A08;
                    boolean z3 = this.A05;
                    AnonymousClass778 r3 = this.A03;
                    int i2 = this.A00;
                    stickerExpressionsFragment = new StickerExpressionsFragment();
                    Bundle A0D3 = C17880vN.A0D();
                    A0D3.putString("rawChatJid", str);
                    A0D3.putBoolean("isExpressionsSearch", z2);
                    A0D3.putBoolean("isCollapsed", z3);
                    A0D3.putInt("arg_search_opener", i2);
                    if (r3 != null) {
                        A0D3.putParcelable("funStickerData", r3);
                    }
                    stickerExpressionsFragment.A1R(A0D3);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                return stickerExpressionsFragment;
            }
        }
        stickerExpressionsFragment.A1R(A0D);
        return stickerExpressionsFragment;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        SparseArray sparseArray = this.A01;
        sparseArray.put(i, (Object) null);
        sparseArray.remove(i);
        super.A0G(viewGroup, obj, i);
    }
}
