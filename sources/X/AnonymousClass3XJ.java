package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3XJ  reason: invalid class name */
public abstract class AnonymousClass3XJ extends C38391rD {
    public Cursor A00 = null;
    public boolean A01 = false;
    public int A02;
    public final DataSetObserver A03;

    public AnonymousClass3XJ() {
        int i;
        C72623Mw r2 = new C72623Mw(this);
        this.A03 = r2;
        Cursor cursor = this.A00;
        if (cursor != null) {
            i = cursor.getColumnIndex("_id");
        } else {
            i = -1;
        }
        this.A02 = i;
        A0K(true);
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(r2);
        }
    }

    public final void A0K(boolean z) {
        super.A0K(true);
    }

    public void Bmc(C42011xT r3, int i) {
        C18070vi.A0d(r3, 0);
        if (this.A01) {
            Cursor cursor = this.A00;
            if (cursor == null || !cursor.moveToPosition(i)) {
                throw AnonymousClass000.A0n(AnonymousClass001.A1I("couldn't move cursor to position ", AnonymousClass000.A10(), i));
            }
            A0V(this.A00, r3);
            return;
        }
        throw AnonymousClass000.A0n("this should only be called when the cursor is valid");
    }

    public long A0M(int i) {
        Cursor cursor;
        Cursor cursor2 = this.A00;
        if (cursor2 == null || !cursor2.moveToPosition(i) || (cursor = this.A00) == null) {
            return 0;
        }
        return cursor.getLong(this.A02);
    }

    public int A0Q() {
        Cursor cursor = this.A00;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public Cursor A0U(Cursor cursor) {
        Cursor cursor2 = this.A00;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            cursor2.unregisterDataSetObserver(this.A03);
        }
        this.A00 = cursor;
        int i = 0;
        boolean A1W = AnonymousClass000.A1W(cursor);
        this.A01 = A1W;
        if (A1W) {
            if (cursor != null) {
                cursor.registerDataSetObserver(this.A03);
            }
            Cursor cursor3 = this.A00;
            if (cursor3 != null) {
                i = cursor3.getColumnIndexOrThrow("_id");
            }
        } else {
            i = -1;
        }
        this.A02 = i;
        notifyDataSetChanged();
        return cursor2;
    }

    public void A0V(Cursor cursor, C42011xT r11) {
        CharSequence A032;
        String str;
        if (this instanceof AnonymousClass407) {
            AnonymousClass407 r1 = (AnonymousClass407) this;
            C74253Zc r112 = (C74253Zc) r11;
            if (cursor != null) {
                int A012 = C17890vO.A01(cursor, "link_index");
                LinksGalleryFragment linksGalleryFragment = r1.A00;
                AnonymousClass206 A022 = C17880vN.A0c(linksGalleryFragment.A0G).A02(cursor, linksGalleryFragment.A0D);
                if (A022 != null) {
                    r112.A0B(A022, A012);
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass3ZX r113 = (AnonymousClass3ZX) r11;
        if (cursor instanceof C109335dH) {
            AnonymousClass21V A013 = ((C109335dH) cursor).A01();
            if (A013 instanceof C438921i) {
                C438921i r5 = (C438921i) A013;
                List list = C42011xT.A0I;
                r113.A00 = r5;
                ImageView imageView = r113.A05;
                DocumentsGalleryFragment documentsGalleryFragment = r113.A0B;
                imageView.setImageDrawable(C137486vX.A00(documentsGalleryFragment.A14(), r5));
                boolean isEmpty = TextUtils.isEmpty(r5.A19());
                TextView textView = r113.A09;
                if (!isEmpty) {
                    A032 = C43351zf.A03(documentsGalleryFragment.A14(), documentsGalleryFragment.A05, r5.A19(), C72453Mb.A0j(documentsGalleryFragment).getSearchTerms());
                } else if (!TextUtils.isEmpty(r5.A19())) {
                    A032 = C64062u9.A0A(r5.A19());
                } else {
                    A032 = documentsGalleryFragment.A1H(2131897363);
                }
                textView.setText(A032);
                File file = AnonymousClass206.A00(r5).A0G;
                TextView textView2 = r113.A08;
                if (file != null) {
                    textView2.setText(C88584aA.A02(documentsGalleryFragment.A05, file.length()));
                    textView2.setVisibility(0);
                    r113.A03.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                    r113.A03.setVisibility(8);
                }
                if (r5.A00 != 0) {
                    TextView textView3 = r113.A07;
                    textView3.setVisibility(0);
                    r113.A01.setVisibility(0);
                    textView3.setText(C62272r8.A04.A09(documentsGalleryFragment.A05, r5));
                } else {
                    r113.A07.setVisibility(8);
                    r113.A01.setVisibility(8);
                }
                String upperCase = C25291Nq.A03(r5.A06).toUpperCase(Locale.US);
                if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r5.A19())) {
                    String A19 = r5.A19();
                    C17960vV.A07(A19);
                    upperCase = C64062u9.A09(A19).toUpperCase(Locale.US);
                }
                r113.A0A.setText(upperCase);
                TextView textView4 = r113.A06;
                if (file != null) {
                    textView4.setText(C64052u8.A0C(documentsGalleryFragment.A05, r5.A0I, false));
                    str = C64052u8.A0C(documentsGalleryFragment.A05, r5.A0I, true);
                } else {
                    str = "";
                    textView4.setText(str);
                }
                textView4.setContentDescription(str);
                View view = r113.A04;
                View view2 = r113.A02;
                boolean z = true;
                if (1 != r5.A0C()) {
                    z = false;
                }
                boolean z2 = r5.A0q;
                if (z) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
                if (z2) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                boolean Bfa = C72453Mb.A0j(documentsGalleryFragment).Bfa(r5);
                View view3 = r113.A0H;
                if (Bfa) {
                    AnonymousClass3MX.A1A(documentsGalleryFragment.A14(), view3, 2131101945);
                    view3.setSelected(true);
                    return;
                }
                view3.setBackgroundResource(2131232942);
                view3.setSelected(false);
            }
        }
    }
}
