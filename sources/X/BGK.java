package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.view.View;
import android.widget.TextView;
import java.io.FileOutputStream;
import java.io.IOException;

public class BGK extends PrintDocumentAdapter {
    public PrintedPdfDocument A00;
    public final Context A01;
    public final CWH A02;
    public final AnonymousClass1KW A03;
    public final String A04;
    public final String A05 = "join_whatsapp_group.pdf";

    public BGK(Context context, CWH cwh, AnonymousClass1KW r4, String str) {
        this.A01 = context;
        this.A03 = r4;
        this.A04 = str;
        this.A02 = cwh;
    }

    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.A00 = new PrintedPdfDocument(this.A01, printAttributes2);
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
        } else {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A05).setContentType(0).setPageCount(1).build(), true);
        }
    }

    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PdfDocument.Page startPage = this.A00.startPage(0);
        Canvas canvas = startPage.getCanvas();
        Context context = this.A01;
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(0, (float) (canvas.getWidth() / 25));
        textView.setGravity(1);
        textView.setText(C43251zV.A03(context, textView.getPaint(), this.A03, this.A04));
        int width = canvas.getWidth() / 8;
        C108995ce.A0v(textView, BE7.A06(canvas.getWidth() - (width * 2)), View.MeasureSpec.makeMeasureSpec(canvas.getHeight(), Integer.MIN_VALUE));
        canvas.translate((float) width, (float) (width / 2));
        textView.draw(canvas);
        int i = -width;
        canvas.translate((float) i, (float) (i / 2));
        CWH cwh = this.A02;
        int i2 = cwh.A01;
        int i3 = cwh.A00;
        int A09 = BE6.A09(canvas.getHeight(), textView.getMeasuredHeight(), canvas.getWidth());
        int i4 = A09 / 8;
        int i5 = A09 - (i4 * 2);
        float f = (((float) i5) * 1.0f) / ((float) i2);
        canvas.translate((float) i4, (float) (i4 + textView.getMeasuredHeight()));
        Paint A06 = AnonymousClass3MW.A06();
        A06.setColor(-16777216);
        int i6 = 0;
        while (true) {
            if (i6 >= i2) {
                int i7 = (i5 * 4) / 15;
                int i8 = (i5 - i7) / 2;
                int i9 = i8 + i7;
                canvas.drawBitmap(BitmapFactory.decodeResource(context.getResources(), 2131232233), (Rect) null, new Rect(i8, i8, i9, i9), (Paint) null);
                this.A00.finishPage(startPage);
                PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
                try {
                    this.A00.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                    this.A00.close();
                    this.A00 = null;
                    writeResultCallback2.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
                    return;
                } catch (IOException e) {
                    writeResultCallback2.onWriteFailed(e.toString());
                    this.A00.close();
                    this.A00 = null;
                    return;
                } catch (Throwable th) {
                    this.A00.close();
                    this.A00 = null;
                    throw th;
                }
            } else {
                for (int i10 = 0; i10 < i3; i10++) {
                    if (cwh.A02[i10][i6] == 1) {
                        canvas.drawRect(f * ((float) i6), f * ((float) i10), f * ((float) (i6 + 1)), f * ((float) (i10 + 1)), A06);
                    }
                }
                i6++;
            }
        }
    }
}
