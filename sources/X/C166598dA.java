package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.8dA  reason: invalid class name and case insensitive filesystem */
public class C166598dA extends C39381sz {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166598dA(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity, Runnable runnable, int i) {
        super(accountLinkingNativeAuthActivity, i, i, i);
        this.A01 = runnable;
    }

    public void onClick(View view) {
        switch (this.A00) {
            case 0:
                ProductDetailActivity productDetailActivity = (ProductDetailActivity) this.A01;
                PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(new C20509ANu(productDetailActivity), true);
                productDetailActivity.A01 = postcodeChangeBottomSheet;
                C18100vl r2 = productDetailActivity.A0C;
                PostcodeViewModel.A00((PostcodeViewModel) r2.getValue(), postcodeChangeBottomSheet, C108945cZ.A1F(((PostcodeViewModel) r2.getValue()).A04));
                postcodeChangeBottomSheet.A0B = productDetailActivity.A4e();
                C20098A7b.A00(postcodeChangeBottomSheet, productDetailActivity);
                return;
            case 1:
                ((View.OnClickListener) this.A01).onClick(view);
                return;
            default:
                C108945cZ.A1P(this.A01);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166598dA(ProductDetailActivity productDetailActivity) {
        super(productDetailActivity);
        this.A01 = productDetailActivity;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166598dA(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.A01 = onClickListener;
    }
}
