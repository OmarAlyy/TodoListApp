// Generated by Dagger (https://dagger.dev).
package com.omar_aly.todo_list.di;

import com.omar_aly.todo_list.repository.TaskRepository;
import com.omar_aly.todo_list.usecase.GetOneToDoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvideGetTaskUseCaseFactory implements Factory<GetOneToDoUseCase> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  public UseCaseModule_ProvideGetTaskUseCaseFactory(
      Provider<TaskRepository> taskRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public GetOneToDoUseCase get() {
    return provideGetTaskUseCase(taskRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetTaskUseCaseFactory create(
      Provider<TaskRepository> taskRepositoryProvider) {
    return new UseCaseModule_ProvideGetTaskUseCaseFactory(taskRepositoryProvider);
  }

  public static GetOneToDoUseCase provideGetTaskUseCase(TaskRepository taskRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetTaskUseCase(taskRepository));
  }
}