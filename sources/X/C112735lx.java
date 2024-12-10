package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaEditText;
import com.whatsapp.bot.home.AiHomeViewAllFragment;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onItemsScroll$1;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Iterator;

/* renamed from: X.5lx  reason: invalid class name and case insensitive filesystem */
public class C112735lx extends C39711tW {
    public final int A00;
    public final Object A01;

    public C112735lx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        boolean z;
        switch (this.A00) {
            case 5:
                boolean z2 = false;
                C18070vi.A0d(recyclerView, 0);
                C112355lL r5 = (C112355lL) this.A01;
                boolean z3 = r5.A03;
                if (i != 0) {
                    z2 = true;
                }
                r5.A03 = z2;
                if (z3 != z2) {
                    Iterator it = r5.A0W.iterator();
                    while (it.hasNext()) {
                        C42061xY r3 = (C42061xY) it.next();
                        r3.A0E(r5.A03);
                        if (r5.A03) {
                            C142627Ae r1 = r5.A0Q;
                            int i2 = r3.A05;
                            if (i2 == -1) {
                                i2 = r3.A04;
                            }
                            z = true;
                            if (i2 == r1.A00) {
                                r3.A0F(z);
                            }
                        }
                        z = false;
                        r3.A0F(z);
                    }
                    return;
                }
                return;
            case 6:
                if (i == 1) {
                    ((AnonymousClass6z6) this.A01).A02 = true;
                    return;
                } else if (i == 0) {
                    C112315lH.A01(((AnonymousClass6z6) this.A01).A07);
                    return;
                } else {
                    return;
                }
            case 7:
                C18070vi.A0d(recyclerView, 0);
                if (i == 0) {
                    AnonymousClass7K6 r12 = (AnonymousClass7K6) this.A01;
                    r12.A0B = false;
                    if (!r12.A0C) {
                        r12.A0K.C4e(r12);
                        return;
                    }
                    return;
                } else if (i == 1) {
                    ((AnonymousClass7K6) this.A01).A0B = true;
                    return;
                } else {
                    return;
                }
            case 10:
                C18070vi.A0d(recyclerView, 0);
                A05(recyclerView);
                return;
            case 11:
                C18070vi.A0d(recyclerView, 0);
                ((C136866uX) this.A01).A06.A03(recyclerView, i);
                return;
            case 13:
                C142627Ae r13 = (C142627Ae) this.A01;
                if (i == 0) {
                    C142627Ae.A03(r13);
                    C142627Ae.A04(r13, r13.A01);
                    C142627Ae.A01(r13);
                    return;
                }
                C142627Ae.A02(r13);
                return;
            case 16:
                C18070vi.A0d(recyclerView, 0);
                View view = ((StickerStorePackPreviewActivity) this.A01).A00;
                if (view != null) {
                    int i3 = 0;
                    if (recyclerView.computeVerticalScrollOffset() <= 0) {
                        i3 = 8;
                    }
                    view.setVisibility(i3);
                    return;
                }
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3;
        C42011xT A0O;
        C111855kX r0;
        ExpressionsSearchViewModel expressionsSearchViewModel;
        WaEditText waEditText;
        LinearLayoutManager linearLayoutManager;
        Object obj;
        String str;
        String str2;
        String str3;
        SearchView searchView;
        View view;
        C110025eo r1;
        switch (this.A00) {
            case 0:
                if (i2 > 0) {
                    ((AiHomeViewAllFragment) this.A01).A26();
                    return;
                }
                return;
            case 1:
                CallGrid.A05((CallGrid) this.A01);
                return;
            case 2:
                C18070vi.A0d(recyclerView, 0);
                EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A01;
                LinearLayoutManager linearLayoutManager2 = emojiExpressionsFragment.A04;
                if (linearLayoutManager2 != null) {
                    int A1O = linearLayoutManager2.A1O();
                    int A1Q = linearLayoutManager2.A1Q();
                    if (A1O >= 0 && A1Q >= 0 && (r0 = emojiExpressionsFragment.A0A) != null) {
                        C135736sg A002 = ((C131546lH) r0.A0U(A1O)).A00();
                        emojiExpressionsFragment.A0B = A002;
                        ((EmojiExpressionsViewModel) emojiExpressionsFragment.A0Q.getValue()).A0H.setValue(A002);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(recyclerView, 0);
                if (i2 != 0 && (expressionsSearchViewModel = ((GifExpressionsFragment) this.A01).A06) != null) {
                    AnonymousClass3MX.A1Q(new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C30391dr) null), C41561wd.A00(expressionsSearchViewModel));
                    return;
                }
                return;
            case 4:
                C18070vi.A0d(recyclerView, 0);
                if (i2 != 0) {
                    waEditText = ((GifSearchContainer) this.A01).A06;
                    break;
                } else {
                    return;
                }
            case 6:
                AnonymousClass6z6 r12 = (AnonymousClass6z6) this.A01;
                if (r12.A02 && i2 != 0) {
                    C112315lH.A01(r12.A07);
                    return;
                }
                return;
            case 7:
                C18070vi.A0d(recyclerView, 0);
                AnonymousClass7K6 r4 = (AnonymousClass7K6) this.A01;
                r4.A0A = true;
                if (r4.A0B || r4.A0C) {
                    int A1O2 = r4.A0I.A1O();
                    RecyclerView recyclerView2 = r4.A07;
                    if (recyclerView2 == null || (A0O = recyclerView2.A0O(A1O2)) == null) {
                        i3 = 0;
                    } else {
                        int i4 = r4.A01;
                        int i5 = r4.A05;
                        int i6 = r4.A03;
                        int i7 = r4.A0D;
                        int left = A0O.A0H.getLeft();
                        int i8 = r4.A0F;
                        int i9 = r4.A06;
                        boolean z = r4.A0L;
                        int i10 = i5 / i9;
                        int A012 = C108995ce.A01(i6, i7);
                        if (z) {
                            left = i6 - left;
                        }
                        i3 = C28851b7.A03((int) (((float) (A1O2 * i10)) + ((((float) ((A012 - left) + i8)) / ((float) i8)) * ((float) i10))), 0, i4);
                    }
                    r4.A04 = i3;
                    r4.A0K.C4g(r4, i3);
                }
                AnonymousClass7K6.A01(r4);
                return;
            case 8:
                C18070vi.A0d(recyclerView, 0);
                MusicBrowseFragment musicBrowseFragment = (MusicBrowseFragment) this.A01;
                if (!musicBrowseFragment.A07) {
                    musicBrowseFragment.A07 = true;
                    ((Handler) musicBrowseFragment.A0B.getValue()).sendEmptyMessage(300);
                    C38251qy layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        C111155iT r7 = (C111155iT) musicBrowseFragment.A0D.getValue();
                        int A0J = linearLayoutManager.A0J();
                        int A0K = linearLayoutManager.A0K();
                        int A1O3 = linearLayoutManager.A1O();
                        C135476sG r02 = r7.A01;
                        if (r02 != null && C18070vi.A19(r02.A00, true) && A0J + A1O3 >= A0K - 3 && A1O3 >= 0) {
                            AnonymousClass1OB r03 = r7.A02;
                            if (r03 == null || !r03.Be2()) {
                                AnonymousClass1IX r04 = (AnonymousClass1IX) r7.A04.A06();
                                String str4 = null;
                                if (r04 != null) {
                                    obj = C29431cG.A0c(r04);
                                } else {
                                    obj = null;
                                }
                                if (!C18070vi.A18(obj, C1418277c.A0E)) {
                                    Handler handler = (Handler) r7.A07.getValue();
                                    Message message = new Message();
                                    AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
                                    Bundle bundle = r7.A00;
                                    if (bundle != null) {
                                        str = bundle.getString("search_text");
                                    } else {
                                        str = null;
                                    }
                                    C72463Mc.A1H("search_text", str, r2);
                                    Bundle bundle2 = r7.A00;
                                    if (bundle2 != null) {
                                        str2 = bundle2.getString("artist_id");
                                    } else {
                                        str2 = null;
                                    }
                                    AnonymousClass1D6.A03("artist_id", str2, r2, 1);
                                    C135476sG r05 = r7.A01;
                                    if (r05 != null) {
                                        str4 = r05.A01;
                                    }
                                    C72463Mc.A1I("end_cursor_from_prev_query", str4, r2);
                                    message.setData(AnonymousClass9O6.A00(r2));
                                    message.what = 1;
                                    handler.sendMessage(message);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                C18070vi.A0d(recyclerView, 0);
                C38251qy layoutManager2 = recyclerView.getLayoutManager();
                C18070vi.A0z(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int A1Q2 = ((LinearLayoutManager) layoutManager2).A1Q();
                AnonymousClass6BJ r22 = (AnonymousClass6BJ) this.A01;
                if (!(recyclerView.getScrollState() == 0 && A1Q2 == -1) && !r22.A4r(0) && i2 >= 0) {
                    if (r22.A4c().A0C() && i2 > 0 && (searchView = r22.A4c().A00) != null) {
                        searchView.clearFocus();
                    }
                    if (!r22.A4q() && r22.A4r(A1Q2) && i2 > 0) {
                        if (r22 instanceof NewsletterDirectoryCategoriesActivity) {
                            C112405lQ r06 = ((NewsletterDirectoryCategoriesActivity) r22).A03;
                            if (r06 == null) {
                                str3 = "newsletterDirectoryCategoriesAdapter";
                            } else {
                                r06.A0U();
                                return;
                            }
                        } else {
                            C112415lR r07 = ((NewsletterDirectoryActivity) r22).A06;
                            if (r07 == null) {
                                str3 = "newsletterDirectoryAdapter";
                            } else {
                                r07.A0U();
                                return;
                            }
                        }
                        C18070vi.A11(str3);
                        throw null;
                    } else if (r22.A4r(A1Q2) && r22.A4q()) {
                        r22.A4m((Integer) null, true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                C18070vi.A0d(recyclerView, 0);
                A05(recyclerView);
                return;
            case 11:
                C18070vi.A0d(recyclerView, 0);
                ((C136866uX) this.A01).A06.A04(recyclerView, i, i2);
                return;
            case 12:
                C18070vi.A0d(recyclerView, 0);
                if (i2 != 0) {
                    waEditText = ((StickerSearchDialogFragment) this.A01).A05;
                    break;
                } else {
                    return;
                }
            case 14:
                SearchFragment searchFragment = (SearchFragment) this.A01;
                C23520Bik bik = searchFragment.A07;
                if (bik != null) {
                    bik.A09(3);
                }
                SearchFragment.A09(searchFragment);
                if (i2 != 0 && recyclerView.getScrollState() == 1) {
                    searchFragment.A0b.C2N(false);
                    return;
                }
                return;
            case 15:
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this.A01;
                int A1N = stickerStoreFeaturedTabFragment.A03.A1N();
                int top = stickerStoreFeaturedTabFragment.A02.getTop();
                if (A1N == 0) {
                    if (top != stickerStoreFeaturedTabFragment.A02.getHeight()) {
                        view = stickerStoreFeaturedTabFragment.A02;
                        r1 = new C110025eo(stickerStoreFeaturedTabFragment.A02, view.getHeight());
                    } else {
                        return;
                    }
                } else if (top != 0 && stickerStoreFeaturedTabFragment.A02.getAnimation() == null) {
                    view = stickerStoreFeaturedTabFragment.A02;
                    r1 = new C110025eo(view, 0);
                } else {
                    return;
                }
                view.startAnimation(r1);
                return;
            case 16:
                C18070vi.A0d(recyclerView, 0);
                View view2 = ((StickerStorePackPreviewActivity) this.A01).A00;
                if (view2 != null) {
                    int i11 = 0;
                    if (recyclerView.computeVerticalScrollOffset() <= 0) {
                        i11 = 8;
                    }
                    view2.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.A04(recyclerView, i, i2);
                return;
        }
        if (waEditText != null) {
            waEditText.A0H();
        }
    }

    public final void A05(RecyclerView recyclerView) {
        View BbS;
        C136866uX r6 = (C136866uX) this.A01;
        if (r6.A04 != null) {
            float A002 = (C72463Mc.A00(recyclerView.getContext()) * 0.8f) + 0.5f;
            float min = Math.min(((float) recyclerView.computeVerticalScrollOffset()) / (AnonymousClass3MW.A00(AnonymousClass000.A0Y(recyclerView), 2131166635) / 3.0f), 1.0f);
            double d = (double) min;
            if (0.0d <= d && d <= 1.0d) {
                A002 *= min;
            }
            C1607789w r0 = r6.A04;
            if (r0 != null && (BbS = r0.BbS()) != null) {
                BbS.setBackgroundColor(AnonymousClass1Z2.A05(AnonymousClass1Z2.A06(r6.A02, (int) (13.0f * min)), r6.A01));
                AnonymousClass1HF.A0W(BbS, A002);
            }
        }
    }
}
