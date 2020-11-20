// Generated by view binder compiler. Do not edit!
package com.example.reglogapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.reglogapi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardViewpass;

  @NonNull
  public final CardView cardViewrep;

  @NonNull
  public final CardView cardViewrw;

  @NonNull
  public final CardView cardVieww;

  @NonNull
  public final EditText confirmPassword;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageViewpass;

  @NonNull
  public final ImageView imageViewrep;

  @NonNull
  public final TextView logintxtbtn;

  @NonNull
  public final Button signupbtn;

  @NonNull
  public final EditText signupemail;

  @NonNull
  public final EditText signupname;

  @NonNull
  public final EditText signuppassword;

  @NonNull
  public final ProgressBar signupprogressbar;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull CardView cardViewpass, @NonNull CardView cardViewrep, @NonNull CardView cardViewrw,
      @NonNull CardView cardVieww, @NonNull EditText confirmPassword, @NonNull Guideline guideline4,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView imageViewpass, @NonNull ImageView imageViewrep,
      @NonNull TextView logintxtbtn, @NonNull Button signupbtn, @NonNull EditText signupemail,
      @NonNull EditText signupname, @NonNull EditText signuppassword,
      @NonNull ProgressBar signupprogressbar, @NonNull TextView textView3,
      @NonNull TextView textView5, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.cardViewpass = cardViewpass;
    this.cardViewrep = cardViewrep;
    this.cardViewrw = cardViewrw;
    this.cardVieww = cardVieww;
    this.confirmPassword = confirmPassword;
    this.guideline4 = guideline4;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageViewpass = imageViewpass;
    this.imageViewrep = imageViewrep;
    this.logintxtbtn = logintxtbtn;
    this.signupbtn = signupbtn;
    this.signupemail = signupemail;
    this.signupname = signupname;
    this.signuppassword = signuppassword;
    this.signupprogressbar = signupprogressbar;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cardViewpass;
      CardView cardViewpass = rootView.findViewById(id);
      if (cardViewpass == null) {
        break missingId;
      }

      id = R.id.cardViewrep;
      CardView cardViewrep = rootView.findViewById(id);
      if (cardViewrep == null) {
        break missingId;
      }

      id = R.id.cardViewrw;
      CardView cardViewrw = rootView.findViewById(id);
      if (cardViewrw == null) {
        break missingId;
      }

      id = R.id.cardVieww;
      CardView cardVieww = rootView.findViewById(id);
      if (cardVieww == null) {
        break missingId;
      }

      id = R.id.confirm_password;
      EditText confirmPassword = rootView.findViewById(id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageViewpass;
      ImageView imageViewpass = rootView.findViewById(id);
      if (imageViewpass == null) {
        break missingId;
      }

      id = R.id.imageViewrep;
      ImageView imageViewrep = rootView.findViewById(id);
      if (imageViewrep == null) {
        break missingId;
      }

      id = R.id.logintxtbtn;
      TextView logintxtbtn = rootView.findViewById(id);
      if (logintxtbtn == null) {
        break missingId;
      }

      id = R.id.signupbtn;
      Button signupbtn = rootView.findViewById(id);
      if (signupbtn == null) {
        break missingId;
      }

      id = R.id.signupemail;
      EditText signupemail = rootView.findViewById(id);
      if (signupemail == null) {
        break missingId;
      }

      id = R.id.signupname;
      EditText signupname = rootView.findViewById(id);
      if (signupname == null) {
        break missingId;
      }

      id = R.id.signuppassword;
      EditText signuppassword = rootView.findViewById(id);
      if (signuppassword == null) {
        break missingId;
      }

      id = R.id.signupprogressbar;
      ProgressBar signupprogressbar = rootView.findViewById(id);
      if (signupprogressbar == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, cardView, cardViewpass,
          cardViewrep, cardViewrw, cardVieww, confirmPassword, guideline4, imageView2, imageView3,
          imageViewpass, imageViewrep, logintxtbtn, signupbtn, signupemail, signupname,
          signuppassword, signupprogressbar, textView3, textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}