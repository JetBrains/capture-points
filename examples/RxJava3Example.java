
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class RxJava3Example {
	public static void main(String[] args) {

		Single.defer(() -> {
			return Single.just(1);
		}).subscribe();

		Single.just(1).map(i -> {
			return 2;
		}).subscribe();

		Single.just(1).mapOptional(i -> {
			return Optional.of(2);
		}).subscribe();

		Single.just(1).flatMap(i -> {
			return Single.just(2);
		}).subscribe();

		Single.just(1).flatMapCompletable(i -> {
			return Completable.complete();
		}).subscribe();

		Single.just(1).flatMapMaybe(i -> {
			return Maybe.empty();
		}).subscribe();

		Single.just(1).flatMapObservable(i -> {
			return Observable.empty();
		}).subscribe();

		Single.just(1).flatMapPublisher(i -> {
			return Flowable.empty();
		}).subscribe();

		Single.just(1).flattenAsFlowable(i -> {
			return List.of(i);
		}).subscribe();

		Single.just(1).flattenAsObservable(i -> {
			return List.of(i);
		}).subscribe();

		Single.just(1).flattenStreamAsFlowable(i -> {
			return Stream.of(i);
		}).subscribe();

		Single.just(1).flattenStreamAsObservable(i -> {
			return Stream.of(i);
		}).subscribe();


		Maybe.defer(() -> {
			return Maybe.empty();
		}).subscribe();

		Maybe.just(1).map(i -> {
			return 2;
		}).subscribe();

		Maybe.just(1).mapOptional(i -> {
			return Optional.of(2);
		}).subscribe();

		Maybe.just(1).flatMap(i -> {
			return Maybe.just(2);
		}).subscribe();

		Maybe.just(1).flatMapCompletable(i -> {
			return Completable.complete();
		}).subscribe();

		Maybe.just(1).flatMapSingle(i -> {
			return Single.just(1);
		}).subscribe();

		Maybe.just(1).flatMapObservable(i -> {
			return Observable.empty();
		}).subscribe();

		Maybe.just(1).flatMapPublisher(i -> {
			return Flowable.empty();
		}).subscribe();

		Maybe.just(1).flattenAsFlowable(i -> {
			return List.of(i);
		}).subscribe();

		Maybe.just(1).flattenAsObservable(i -> {
			return List.of(i);
		}).subscribe();

		Maybe.just(1).flattenStreamAsFlowable(i -> {
			return Stream.of(i);
		}).subscribe();

		Maybe.just(1).flattenStreamAsObservable(i -> {
			return Stream.of(i);
		}).subscribe();


		Completable.defer(() -> {
			return Completable.complete();
		}).subscribe();


		Observable.defer(() -> {
			return Observable.empty();
		}).subscribe();

		Observable.just(1).map(i -> {
			return 2;
		}).subscribe();

		Observable.just(1).mapOptional(i -> {
			return Optional.of(2);
		}).subscribe();

		Observable.just(1).flatMap(i -> {
			return Observable.just(2);
		}).subscribe();

		Observable.just(1).flatMapCompletable(i -> {
			return Completable.complete();
		}).subscribe();

		Observable.just(1).flatMapSingle(i -> {
			return Single.just(1);
		}).subscribe();

		Observable.just(1).flatMapMaybe(i -> {
			return Maybe.empty();
		}).subscribe();


		Flowable.defer(() -> {
			return Flowable.empty();
		}).subscribe();

		Flowable.just(1).map(i -> {
			return 2;
		}).subscribe();

		Flowable.just(1).mapOptional(i -> {
			return Optional.of(2);
		}).subscribe();

		Flowable.just(1).flatMap(i -> {
			return Flowable.just(2);
		}).subscribe();

		Flowable.just(1).flatMapCompletable(i -> {
			return Completable.complete();
		}).subscribe();

		Flowable.just(1).flatMapSingle(i -> {
			return Single.just(1);
		}).subscribe();

		Flowable.just(1).flatMapMaybe(i -> {
			return Maybe.empty();
		}).subscribe();
	}
}
