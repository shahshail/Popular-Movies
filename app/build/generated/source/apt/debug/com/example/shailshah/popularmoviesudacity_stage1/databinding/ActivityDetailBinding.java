package com.example.shailshah.popularmoviesudacity_stage1.databinding;
import com.example.shailshah.popularmoviesudacity_stage1.R;
import com.example.shailshah.popularmoviesudacity_stage1.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_detail, 1);
        sViewsWithIds.put(R.id.header, 2);
        sViewsWithIds.put(R.id.add_favorite, 3);
        sViewsWithIds.put(R.id.tv_movie_title, 4);
        sViewsWithIds.put(R.id.iv_show_movie_poster, 5);
        sViewsWithIds.put(R.id.tv_show_movie_year, 6);
        sViewsWithIds.put(R.id.button, 7);
        sViewsWithIds.put(R.id.ratingBar, 8);
        sViewsWithIds.put(R.id._tv_movie_rating, 9);
        sViewsWithIds.put(R.id.textView, 10);
        sViewsWithIds.put(R.id.tv_release_date, 11);
        sViewsWithIds.put(R.id.textView6, 12);
        sViewsWithIds.put(R.id.trailer, 13);
        sViewsWithIds.put(R.id.vote_count, 14);
        sViewsWithIds.put(R.id.review_button, 15);
        sViewsWithIds.put(R.id.tv_overview, 16);
        sViewsWithIds.put(R.id.progressBar, 17);
        sViewsWithIds.put(R.id.watch_trailer_1, 18);
        sViewsWithIds.put(R.id.view, 19);
        sViewsWithIds.put(R.id.watch_trailer_2, 20);
        sViewsWithIds.put(R.id.view5, 21);
        sViewsWithIds.put(R.id.view_2, 22);
        sViewsWithIds.put(R.id.connection, 23);
    }
    // views
    @NonNull
    public final android.widget.TextView TvMovieRating;
    @NonNull
    public final android.support.constraint.ConstraintLayout activityDetail;
    @NonNull
    public final android.support.design.widget.FloatingActionButton addFavorite;
    @NonNull
    public final android.widget.Button button;
    @NonNull
    public final android.widget.TextView connection;
    @NonNull
    public final android.widget.ImageView header;
    @NonNull
    public final android.widget.ImageView ivShowMoviePoster;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    @NonNull
    public final android.widget.RatingBar ratingBar;
    @NonNull
    public final android.widget.Button reviewButton;
    @NonNull
    public final android.support.v4.widget.SwipeRefreshLayout swipeToRefresh;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.widget.TextView textView6;
    @NonNull
    public final android.widget.TextView trailer;
    @NonNull
    public final android.widget.TextView tvMovieTitle;
    @NonNull
    public final android.widget.TextView tvOverview;
    @NonNull
    public final android.widget.TextView tvReleaseDate;
    @NonNull
    public final android.widget.TextView tvShowMovieYear;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.view.View view2;
    @NonNull
    public final android.view.View view5;
    @NonNull
    public final android.widget.TextView voteCount;
    @NonNull
    public final android.widget.Button watchTrailer1;
    @NonNull
    public final android.widget.Button watchTrailer2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds);
        this.TvMovieRating = (android.widget.TextView) bindings[9];
        this.activityDetail = (android.support.constraint.ConstraintLayout) bindings[1];
        this.addFavorite = (android.support.design.widget.FloatingActionButton) bindings[3];
        this.button = (android.widget.Button) bindings[7];
        this.connection = (android.widget.TextView) bindings[23];
        this.header = (android.widget.ImageView) bindings[2];
        this.ivShowMoviePoster = (android.widget.ImageView) bindings[5];
        this.progressBar = (android.widget.ProgressBar) bindings[17];
        this.ratingBar = (android.widget.RatingBar) bindings[8];
        this.reviewButton = (android.widget.Button) bindings[15];
        this.swipeToRefresh = (android.support.v4.widget.SwipeRefreshLayout) bindings[0];
        this.swipeToRefresh.setTag(null);
        this.textView = (android.widget.TextView) bindings[10];
        this.textView6 = (android.widget.TextView) bindings[12];
        this.trailer = (android.widget.TextView) bindings[13];
        this.tvMovieTitle = (android.widget.TextView) bindings[4];
        this.tvOverview = (android.widget.TextView) bindings[16];
        this.tvReleaseDate = (android.widget.TextView) bindings[11];
        this.tvShowMovieYear = (android.widget.TextView) bindings[6];
        this.view = (android.view.View) bindings[19];
        this.view2 = (android.view.View) bindings[22];
        this.view5 = (android.view.View) bindings[21];
        this.voteCount = (android.widget.TextView) bindings[14];
        this.watchTrailer1 = (android.widget.Button) bindings[18];
        this.watchTrailer2 = (android.widget.Button) bindings[20];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityDetailBinding>inflate(inflater, com.example.shailshah.popularmoviesudacity_stage1.R.layout.activity_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.shailshah.popularmoviesudacity_stage1.R.layout.activity_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}