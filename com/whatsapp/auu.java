package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import com.whatsapp.ConversationRowContact.AddOrEditContactDialogFragment;
import com.whatsapp.util.bu;

class auu implements OnClickListener {
    final AddOrEditContactDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!(AddOrEditContactDialogFragment.a(this.a) || AddOrEditContactDialogFragment.b(this.a) == null)) {
            Bitmap g = AddOrEditContactDialogFragment.b(this.a).g();
            if (g != null) {
                AddOrEditContactDialogFragment.a(this.a, g);
            }
        }
        bu.a(AddOrEditContactDialogFragment.d(this.a), AddOrEditContactDialogFragment.c(this.a), this.a, 25);
    }

    auu(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
        this.a = addOrEditContactDialogFragment;
    }
}
