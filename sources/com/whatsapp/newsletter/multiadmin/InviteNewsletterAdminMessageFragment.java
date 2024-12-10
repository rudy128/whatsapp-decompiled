package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass5OE;
import X.AnonymousClass5OF;
import X.C105745Te;
import X.C108115b9;
import X.C108435bh;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C21356Ail;
import X.C22971Dz;
import X.C24921Me;
import X.C27201Vd;
import X.C29351c6;
import X.C29401cD;
import X.C29691ci;
import X.C36401np;
import X.C37451pZ;
import X.C46162Dk;
import X.C72453Mb;
import X.C74743cP;
import X.C88414Zp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminMessageFragment extends Hilt_InviteNewsletterAdminMessageFragment implements C108435bh {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C37451pZ A02;
    public C27201Vd A03;
    public SelectedContactsList A04;
    public C18000vb A05;
    public AnonymousClass1CJ A06;
    public C46162Dk A07;
    public C18030ve A08;
    public MentionableEntry A09;
    public C36401np A0A;
    public AnonymousClass00H A0B;
    public ArrayList A0C = AnonymousClass000.A13();
    public final C18100vl A0D = C88414Zp.A00(this, "arg_from_contacts_picker");
    public final C18100vl A0E;
    public final C18100vl A0F;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625741, viewGroup);
        C18070vi.A0X(inflate);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        String A16;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Iterator it = AnonymousClass3MW.A11(this.A0E).iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                AnonymousClass1M9 r0 = this.A00;
                if (r0 == null) {
                    break;
                }
                AnonymousClass1E7 A0E2 = r0.A0E(A0Q);
                if (A0E2 != null) {
                    A0E2.A0y = true;
                    this.A0C.add(A0E2);
                }
            } else {
                TextView A0E3 = C17880vN.A0E(view, 2131433058);
                C46162Dk r02 = this.A07;
                String str2 = "newsletterInfo";
                if (r02 != null) {
                    A0E3.setText(r02.A0T);
                    MentionableEntry mentionableEntry = (MentionableEntry) AnonymousClass1HF.A06(view, 2131427677);
                    this.A09 = mentionableEntry;
                    if (mentionableEntry != null) {
                        Object[] objArr = new Object[1];
                        C46162Dk r03 = this.A07;
                        if (r03 != null) {
                            mentionableEntry.setText(AnonymousClass3MX.A16(this, r03.A0T, objArr, 0, 2131891459));
                        }
                    }
                    AnonymousClass1M9 r1 = this.A00;
                    if (r1 != null) {
                        AnonymousClass1E7 A0E4 = r1.A0E(AnonymousClass3MX.A0m(this.A0F));
                        if (A0E4 != null) {
                            C37451pZ r12 = this.A02;
                            if (r12 == null) {
                                str2 = "contactPhotoLoader";
                            } else {
                                r12.A07(AnonymousClass3MW.A0H(view, 2131433025), A0E4);
                            }
                        }
                        ImageView A0H = AnonymousClass3MW.A0H(view, 2131427681);
                        C18000vb r2 = this.A05;
                        if (r2 != null) {
                            C74743cP.A03(AnonymousClass3MX.A06(A0H.getContext(), 2131232506), A0H, r2);
                            AnonymousClass3Ma.A19(A0H, this, 1);
                            TextView A0E5 = C17880vN.A0E(view, 2131427683);
                            C18100vl r4 = this.A0D;
                            if (C72453Mb.A1a(r4)) {
                                A16 = A1H(2131891460);
                            } else {
                                Object[] objArr2 = new Object[1];
                                C24921Me r13 = this.A01;
                                if (r13 != null) {
                                    A16 = AnonymousClass3MX.A16(this, AnonymousClass3MY.A0q(r13, (AnonymousClass1E7) this.A0C.get(0)), objArr2, 0, 2131891458);
                                } else {
                                    str = "waContactNames";
                                }
                            }
                            A0E5.setText(A16);
                            AnonymousClass3Ma.A19(view.findViewById(2131427679), this, 2);
                            if (C72453Mb.A1a(r4)) {
                                View A0G = AnonymousClass3MY.A0G((ViewStub) C18070vi.A05(view, 2131435116), 2131626871);
                                C18070vi.A0z(A0G, "null cannot be cast to non-null type com.whatsapp.contact.picker.SelectedContactsList");
                                SelectedContactsList selectedContactsList = (SelectedContactsList) A0G;
                                this.A04 = selectedContactsList;
                                if (selectedContactsList != null) {
                                    selectedContactsList.A08 = this;
                                    selectedContactsList.A09 = this.A0C;
                                    selectedContactsList.setVisibility(0);
                                }
                                SelectedContactsList selectedContactsList2 = this.A04;
                                if (selectedContactsList2 != null) {
                                    C18070vi.A05(selectedContactsList2, 2131435111).setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            View A0G2 = AnonymousClass3MY.A0G((ViewStub) C18070vi.A05(view, 2131431806), 2131625738);
                            C18070vi.A0z(A0G2, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                            TextView textView = (TextView) A0G2;
                            C36401np r5 = this.A0A;
                            if (r5 != null) {
                                textView.setText(r5.A05(A1n(), new C21356Ail(this, 30), AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131891461), "learn-more"));
                                C18030ve r04 = this.A08;
                                if (r04 != null) {
                                    AnonymousClass3Ma.A1I(textView, r04);
                                    return;
                                }
                                str = "abProps";
                            } else {
                                str = "linkifier";
                            }
                        } else {
                            str = "whatsAppLocale";
                        }
                    }
                }
                C18070vi.A11(str2);
            }
        }
        str = "contactManager";
        C18070vi.A11(str);
        throw null;
    }

    public void BEb(AnonymousClass1E7 r5) {
        C108115b9 r1;
        C18070vi.A0d(r5, 0);
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C108115b9) && (r1 = (C108115b9) A1B) != null) {
            r1.Bpy(r5);
        }
        ArrayList arrayList = this.A0C;
        arrayList.remove(r5);
        if (arrayList.isEmpty()) {
            A28();
            return;
        }
        SelectedContactsList selectedContactsList = this.A04;
        if (selectedContactsList != null) {
            selectedContactsList.A09 = arrayList;
        }
        C18100vl r2 = this.A0E;
        C29401cD.A0N(AnonymousClass3MW.A11(r2), new C105745Te(r5));
        SelectedContactsList selectedContactsList2 = this.A04;
        if (selectedContactsList2 != null) {
            List A11 = AnonymousClass3MW.A11(r2);
            ArrayList A0D2 = C29351c6.A0D(A11);
            Iterator it = A11.iterator();
            while (it.hasNext()) {
                A0D2.add(C22971Dz.A00(C17880vN.A0S(it)));
            }
            if (!A0D2.isEmpty()) {
                selectedContactsList2.A07.notifyDataSetChanged();
            }
        }
    }

    public void C4v() {
    }

    public void C4w() {
    }

    public void CRZ() {
    }

    public InviteNewsletterAdminMessageFragment() {
        Integer num = AnonymousClass00R.A0C;
        this.A0E = AnonymousClass1DF.A00(num, new AnonymousClass5OF(this));
        this.A0F = AnonymousClass1DF.A00(num, new AnonymousClass5OE(this));
    }

    public void A1s() {
        super.A1s();
        this.A04 = null;
    }

    public void A1z(Bundle bundle) {
        String str;
        C46162Dk r1;
        super.A1z(bundle);
        if (!AnonymousClass3MW.A11(this.A0E).isEmpty()) {
            AnonymousClass1CJ r12 = this.A06;
            if (r12 != null) {
                C29691ci A0A2 = r12.A0A(AnonymousClass3MX.A0m(this.A0F));
                if ((A0A2 instanceof C46162Dk) && (r1 = (C46162Dk) A0A2) != null) {
                    this.A07 = r1;
                    C27201Vd r2 = this.A03;
                    if (r2 != null) {
                        this.A02 = r2.A04(A14(), this, "AddNewsletterAdminInviteFragment");
                        return;
                    }
                    str = "contactPhotos";
                }
            } else {
                str = "chatsCache";
            }
            C18070vi.A11(str);
            throw null;
        }
        A28();
    }

    public void BIz(ThumbnailButton thumbnailButton, AnonymousClass1E7 r3) {
        C18070vi.A0h(r3, thumbnailButton);
        C37451pZ r0 = this.A02;
        if (r0 == null) {
            C18070vi.A11("contactPhotoLoader");
            throw null;
        } else {
            r0.A07(thumbnailButton, r3);
        }
    }
}
